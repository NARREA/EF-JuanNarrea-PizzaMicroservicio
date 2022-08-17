package com.idat.pizzaservicio.modelo;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="pizzas_clientes")
public class PizzaDetalle {
	
	@EmbeddedId
	private PizzaClienteFK fk= new PizzaClienteFK();

}
