package com.idat.pizzaservicio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.idat.pizzaservicio.Cliente.OpenGeignCliente;
import com.idat.pizzaservicio.DTO.Cliente;
import com.idat.pizzaservicio.modelo.Pizza;
import com.idat.pizzaservicio.modelo.PizzaClienteFK;
import com.idat.pizzaservicio.modelo.PizzaDetalle;
import com.idat.pizzaservicio.repository.PizzaClienteRepository;
import com.idat.pizzaservicio.repository.PizzaRepository;

public class PizzaServiceImpl implements PizzaService {
	
	@Autowired
	private PizzaRepository repository;
	
	@Autowired
	private PizzaClienteRepository repositoryDetalle;
	
	@Autowired
	private OpenGeignCliente feign;

	@Override
	public List<Pizza> listar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Pizza ObtenerId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

	@Override
	public void guardar(Pizza pizza) {
		// TODO Auto-generated method stub
		repository.save(pizza);

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);

	}

	@Override
	public void actualizar(Pizza pizza) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(pizza);

	}

	@Override
	public void asignarClienteaPizza() {
		// TODO Auto-generated method stub
		List<Cliente> listado= feign.listarClientesSeleccionados();
		PizzaClienteFK fk= null;
		PizzaDetalle detalle = null;
		
		for(Cliente cliente: listado) {
			
			fk=new PizzaClienteFK();			
			fk.setIdCliente(cliente.getIdCliente());
			fk.setIdPizza(1);
			
			detalle = new PizzaDetalle();
			detalle.setFk(fk);
			
			repositoryDetalle.save(detalle);
			
		}

	}

}
