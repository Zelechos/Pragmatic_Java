package com.com470.boleto.app.controller;

import com.com470.boleto.app.dao.BoletoDao;
import com.com470.boleto.app.entities.Boleto;
import com.com470.boleto.app.service.BoletoService;
import java.util.Date;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class BoletoControllerTest {

    private static final Boleto boleto = new Boleto();

    public BoletoControllerTest() {

    }

    @Mock
    private BoletoDao boletoDao;

    @InjectMocks
    BoletoController boletoController;

    @InjectMocks
    BoletoService boletoService;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);

    }

    @Test
    public void testCreateBoleto() {

        boleto.setBoletoId(1);
        boleto.setNombreDelPasajero("Jorge Perez");
        boleto.setSalida("Sucre");
        boleto.setDestino("Potosi");
        boleto.setFecha(new Date());
        boleto.setEmail("jorge.perez@gmail.com");

        Mockito.when(boletoDao.save(boleto)).thenReturn(boleto);
        Assertions.assertThat(boletoService.createBoleto(boleto)).isEqualTo(boleto);

    }

    @Test
    public void testGetBoletoById() {

        boleto.setBoletoId(boleto.getBoletoId());

        boleto.setNombreDelPasajero(boleto.getNombreDelPasajero());

        boleto.setSalida(boleto.getSalida());

        boleto.setDestino(boleto.getDestino());

        boleto.setFecha(boleto.getFecha());

        boleto.setEmail(boleto.getEmail());

        Mockito.when(boletoDao.findOne(1)).thenReturn(boleto);
        Assertions.assertThat(boletoService.getBoletoById(1)).isEqualTo(boleto);

    }

//    falta este
    @Test
    public void testGetAllBoletos() {

        boleto.setBoletoId(1);
        boleto.setNombreDelPasajero("Jorge Perez");
        boleto.setSalida("Sucre");
        boleto.setDestino("Potosi");
        boleto.setFecha(new Date());
        boleto.setEmail("jorge.perez@gmail.com");

        Mockito.when(boletoDao.findOne(1)).thenReturn(boleto);
        Assertions.assertThat(boletoService.getAllBoletos().iterator()).isEqualTo(boleto);

    }
    

    @Test
    public void testdeleteBoleto() {

        boleto.setBoletoId(1);

        boleto.setNombreDelPasajero("Jorge Perez");

        boleto.setSalida("Sucre");

        boleto.setDestino("Potosi");

        boleto.setFecha(new Date());

        boleto.setEmail("jorge.perez@gmail.com");

        boletoService.deleteBoleto(1);

        Mockito.when(boletoDao.findOne(1)).thenReturn(boleto);
        Assertions.assertThat(boleto).isEqualTo(boleto);

    }

    //    falta este
    @Test
    public void testupdateBoleto() {
        Boleto boleto1 = new Boleto();

        boleto.setBoletoId(1);
        boleto.setNombreDelPasajero("Jorge Perez");
        boleto.setSalida("Sucre");
        boleto.setDestino("Potosi");
        boleto.setFecha(new Date());
        boleto.setEmail("github.com/Zelechos");

        boleto1.setBoletoId(2);
        boleto1.setNombreDelPasajero("Jorge Perez");
        boleto1.setSalida("Sucre");
        boleto1.setDestino("Potosi");
        boleto1.setFecha(new Date());
        boleto1.setEmail("ether.com");

        System.out.println("boleto => " + boleto.getEmail());


        Mockito.when(boletoDao.save(boleto)).thenReturn(boleto);
        Assertions.assertThat(boletoService.updateBoleto(1, "ether.com")).isEqualTo(boleto1);

    }

}
