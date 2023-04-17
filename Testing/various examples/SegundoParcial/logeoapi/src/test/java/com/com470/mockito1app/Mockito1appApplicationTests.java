package com.com470.mockito1app;

//import org.junit.jupiter.api.Test;

import com.com470.mockito1app.controller.ExcepcionCuentaEnUso;
import com.com470.mockito1app.controller.ExcepcionUsuarioDesconocido;
import com.com470.mockito1app.controller.ICuenta;
import com.com470.mockito1app.controller.IRepositorioCuentas;
import com.com470.mockito1app.service.GestorLogin;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.springframework.boot.test.context.SpringBootTest;

//import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Mockito1appApplicationTests {
   
    IRepositorioCuentas repo;
    
    @Mock
    Icuenta cuenta;
    
    @Before
    public void inicializarTest(){
        when(repo.buscar("pepe")).thenReturn(true);
        
    }
    
    @Test
    public void testAccesoConcedidoALaPrimera() {
        when.(cuenta.claveCorrecta("1234")).thenReturn(true);
        
    }
    
    @Test
    public void testAccesoDenegadoALaPriemera(){
        
    }
    
//    @Test(expect = ExcepcionUsuarioDesconocido.class)
    public void testUsuarioIncorrecto(){
        when(repo.buscar("bartolo")).thenReturn(null);
    }
    
    @Test
    public void testAccederTrasUnIntento(){
        
    }
    
    @Test
    public void testAccederTrasDosIntento(){
        
    }
    

    @Test
    public void testBloquearTrasCuatroIntentos(){
        when(cuenta.claveCorrecta("1234")).thenReturn(false);
        GestorLogin login = new GestorLogin(repo);
        login.acceder("pepe", "1234");
        
    }
    
    @Test
    public void testAccesoDenegadoCuentaBloqueada(){
        
    }
    
    @Test(expect = ExcepcionCuentaEnUso.class)
    public void testCuentaEnUso(){
       
    }
}
