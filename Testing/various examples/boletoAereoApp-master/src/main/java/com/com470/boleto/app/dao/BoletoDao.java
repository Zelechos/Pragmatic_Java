package com.com470.boleto.app.dao;

import org.springframework.data.repository.CrudRepository;
import com.com470.boleto.app.entities.Boleto;


public interface BoletoDao extends CrudRepository<Boleto, Integer> {
    Boleto findByEmail(String email);

}
