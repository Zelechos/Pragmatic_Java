package com.com470.boleto.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.com470.boleto.app.dao.BoletoDao;
import com.com470.boleto.app.entities.Boleto;

@Service
public class BoletoService {
	
	@Autowired
	BoletoDao boletoDao;

	public Boleto createBoleto(Boleto boleto) {
		// TODO Auto-generated method stub
		return boletoDao.save(boleto);
	}

	public Boleto getBoletoById(Integer boletoId) {
		
		return boletoDao.findOne(boletoId);
	}

	public Iterable<Boleto> getAllBoletos() {
		return boletoDao.findAll();
	}

	public void deleteBoleto(Integer boletoId) {
		 boletoDao.delete(boletoId);
		
	}

	public Boleto updateBoleto(int boletoId, String email) {
		Boleto boleto = boletoDao.findOne(boletoId);
		boleto.setEmail(email);
		return boletoDao.save(boleto);
	}

}
