package com.com470.boleto.app.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="boleto")
public class Boleto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="boleto_id")
	private Integer boletoId;
	
	@Column(name="nombre_pasajero", nullable = false)
	private String nombreDelPasajero;
	
	@Column(name="fecha")
	private Date fecha;
	
	@Column(name="salida")
	private String salida;
	
	@Column(name="destino")
	private String destino;
	
	@Column(name="email")
	private String email;

	public Integer getBoletoId() {
		return boletoId;
	}

	public void setBoletoId(Integer boletoId) {
		this.boletoId = boletoId;
	}

	public String getNombreDelPasajero() {
		return nombreDelPasajero;
	}

	public void setNombreDelPasajero(String nombreDelPasajero) {
		this.nombreDelPasajero = nombreDelPasajero;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getSalida() {
		return salida;
	}

	public void setSalida(String salida) {
		this.salida = salida;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

}
