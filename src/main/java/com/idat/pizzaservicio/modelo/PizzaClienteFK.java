package com.idat.pizzaservicio.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class PizzaClienteFK implements Serializable{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7978586706408230931L;
	
	@Column(name="id_pizza", nullable = false, unique = true)
	private Integer idPizza;
	
	@Column(name="id_cliente", nullable = false, unique = true)
	private Integer idCliente;

}
