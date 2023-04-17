/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/Pragmatic_Java
 */
package com.com470.boleto.app.service;

import com.com470.boleto.app.dao.BoletoDao;
import com.com470.boleto.app.entities.Boleto;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hamcrest.Matchers;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class BoletoServiceTest {
    
     @Mock
    private BoletoDao boletoDao;

    @InjectMocks
    BoletoService boletoService;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    

    @Test
    public void testCreateBoleto() {
        Boleto boleto = new Boleto();
        
        boleto.setBoletoId(1);
        boleto.setNombreDelPasajero("Jorge Perez");
        boleto.setSalida("Sucre");
        boleto.setDestino("Potosi");
        boleto.setFecha(new Date());
        boleto.setEmail("jorge.perez@gmail.com");
        
       
        Mockito.when(boletoService.createBoleto(boleto)).thenReturn(boleto);
        assertThat(boletoService.createBoleto(boleto), Matchers.equalTo(boleto));
        
    }

    @Test
    public void testGetBoletoById() {
        Boleto boleto = new Boleto();
        boleto.setBoletoId(boleto.getBoletoId());
        boleto.setNombreDelPasajero(boleto.getNombreDelPasajero());
        boleto.setSalida(boleto.getSalida());
        boleto.setDestino(boleto.getDestino());
        boleto.setFecha(boleto.getFecha());
        boleto.setEmail(boleto.getEmail());
        
        Mockito.when(boletoService.getBoletoById(1)).thenReturn(boleto);
        assertThat(boletoService.getBoletoById(1),Matchers.equalTo(boleto));
    }

    @Test
    public void testGetAllBoletos() {
        List<Boleto> boletos = new ArrayList<Boleto>();
        
        Boleto boleto = new Boleto();
        boleto.setBoletoId(1);
        boleto.setNombreDelPasajero("Jorge Perez");
        boleto.setSalida("Sucre");
        boleto.setDestino("Potosi");
        boleto.setFecha(new Date());
        boleto.setEmail("jorge.perez@gmail.com");
        
        boletos.add(boleto);
        Mockito.when(boletoService.getAllBoletos()).thenReturn(boletos);
        assertThat(boletoService.getAllBoletos(), Matchers.equalTo(boletos));

    }

    @Test
    public void testdeleteBoleto() {
        boletoService.deleteBoleto(1);
        Mockito.verify(boletoDao).delete(1);
    }

    @Test
    public void testupdateBoleto() {
        Boleto boleto = new Boleto();
        boleto.setBoletoId(1);
        boleto.setNombreDelPasajero("Jorge Perez");
        boleto.setSalida("Sucre");
        boleto.setDestino("Potosi");
        boleto.setFecha(new Date());
        boleto.setEmail("jorge.perez@gmail.com");
        
        String email = "https://github.com/Zelechos";
        
            
        Mockito.when(boletoService.getBoletoById(1)).thenReturn(boleto);
        boleto.setEmail(email);
        Mockito.when(boletoService.createBoleto(boleto)).thenReturn(boleto);
        assertThat(boletoService.updateBoleto(1, "jorge.perez@gmail.com"), Matchers.equalTo(boleto));

    }    


    
}
