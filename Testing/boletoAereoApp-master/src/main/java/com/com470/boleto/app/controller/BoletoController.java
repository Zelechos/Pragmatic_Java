package com.com470.boleto.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.com470.boleto.app.entities.Boleto;
import com.com470.boleto.app.service.BoletoService;

@RestController
@RequestMapping(value="api/boletos")
public class BoletoController {
	
	@Autowired
	BoletoService boletoService;
	
	@PostMapping(value="/create")
	public Boleto createBoleto(@RequestBody Boleto boleto) {
		return boletoService.createBoleto(boleto);
	}
	
	@GetMapping(value="/boleto/{boletoId}")
	public Boleto getBoletoById(@PathVariable("boletoId")Integer boletoId) {
		return boletoService.getBoletoById(boletoId);
	}
	
	@GetMapping(value="/boleto/todosLosBoletos")
	public Iterable<Boleto> getAllBoletos(){
		return boletoService.getAllBoletos();
	}
	
	@DeleteMapping(value="/boleto/{boletoId}")
	public void deleteBoleto(@PathVariable("boletoId")Integer boletoId) {
		boletoService.deleteBoleto(boletoId);
	}
	
	@PutMapping(value="/boleto/{boletoId}/{nuevoEmail:.+}")
	public Boleto updateBoleto(@PathVariable("boletoId")int  boletoId, @PathVariable("nuevoEmail")String email) {
		return boletoService.updateBoleto(boletoId, email);
	}
}
