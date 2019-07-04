package com.bolsadeideas.springboot.web.app.models.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.web.app.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long> {
}
