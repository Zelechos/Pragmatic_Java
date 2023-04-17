package com.com470.boleto.app;

import com.com470.boleto.app.entities.Boleto;
import com.com470.boleto.app.service.BoletoService;
import java.util.Date;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	//	SpringApplication.run(Application.class, args);
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		BoletoService boletoservice = context.getBean("boletoService", BoletoService.class);
		
		Boleto boleto = new Boleto();
		boleto.setBoletoId(1);
		boleto.setFecha(new Date());
		boleto.setEmail("juan.perez@gmail.com");
		boleto.setNombreDelPasajero("Juan Perez");
		boleto.setSalida("Sucre");
		boleto.setDestino("Potosi");
		boletoservice.createBoleto(boleto);
        
	}

}
