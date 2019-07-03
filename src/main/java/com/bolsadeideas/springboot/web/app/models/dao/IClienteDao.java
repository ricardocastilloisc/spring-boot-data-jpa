package com.bolsadeideas.springboot.web.app.models.dao;

import java.util.List;

import com.bolsadeideas.springboot.web.app.models.entity.Cliente;

public interface IClienteDao {
	
	public List<Cliente> findAll();

}
