package com.com470.mockito1app.service;

import com.com470.mockito1app.controller.ExcepcionCuentaEnUso;
import com.com470.mockito1app.controller.ICuenta;
import com.com470.mockito1app.controller.IRepositorioCuentas;
import com.com470.mockito1app.controller.ExcepcionUsuarioDesconocido;

public class GestorLogin {

	private IRepositorioCuentas repo;
	private int numFallos;
	private static final int MAX_FALLOS = 3;
	private String usuarioAnterior = "";

	public GestorLogin(IRepositorioCuentas repo) {
		this.repo = repo;
		numFallos = 0;
	}

	public void acceder(String usuario, String clave) {
		ICuenta cuenta = repo.buscar(usuario);
		
		if (cuenta == null)
			throw new ExcepcionUsuarioDesconocido();
		
		if (cuenta.estaEnUso())
			throw new ExcepcionCuentaEnUso();

		if (! cuenta.estaBloqueada()) {
			if (cuenta.claveCorrecta(clave)) {
				cuenta.entrarCuenta();
			}else {
				if (! usuario.equals(usuarioAnterior)) {
					numFallos = 0;
					usuarioAnterior = usuario;
				}
				numFallos++;
				if (numFallos == MAX_FALLOS) {
					cuenta.bloquearCuenta();
				}
			}
		}
	}

}
