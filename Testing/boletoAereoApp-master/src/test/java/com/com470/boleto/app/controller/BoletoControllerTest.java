/*
 * @Author : Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/Pragmatic_Java
 */
package com.com470.boleto.app.controller;

import com.com470.boleto.app.entities.Boleto;
import com.com470.boleto.app.service.BoletoService;
import java.util.ArrayList;
import java.util.Date;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class BoletoControllerTest {
    
    
    @Mock
    private BoletoService boletoService;;

    @InjectMocks
    BoletoController boletoController;

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
        
        boletoController.createBoleto(boleto);
        Mockito.verify(boletoService).createBoleto(boleto);
        
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
                
        
        boletoController.getBoletoById(1);
        Mockito.verify(boletoService).getBoletoById(1);
    }

    @Test
    public void testGetAllBoletos() {
        
        ArrayList<Boleto> boletos = new ArrayList<Boleto>();
        
        boletos.add(new Boleto());
        boletos.add(new Boleto());
        boletos.add(new Boleto());
        
        boletoController.getAllBoletos();
        Mockito.verify(boletoService).getAllBoletos();

    }

    @Test
    public void testdeleteBoleto() {
        Boleto boleto = new Boleto();
        boleto.setBoletoId(1);
        boleto.setNombreDelPasajero("Jorge Perez");
        boleto.setSalida("Sucre");
        boleto.setDestino("Potosi");
        boleto.setFecha(new Date());
        boleto.setEmail("jorge.perez@gmail.com");
        
        boletoController.deleteBoleto(1);
        Mockito.verify(boletoService).deleteBoleto(1);
        
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
    
        boletoController.updateBoleto(boleto.getBoletoId(), boleto.getEmail());
        Mockito.verify(boletoService).updateBoleto(boleto.getBoletoId(), boleto.getEmail());
    
    }
    
}
