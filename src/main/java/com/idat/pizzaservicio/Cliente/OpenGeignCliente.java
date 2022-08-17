package com.idat.pizzaservicio.Cliente;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.pizzaservicio.DTO.Cliente;

@FeignClient(name = "idat-cliente", url="localhost:8080")
public interface OpenGeignCliente {
	
	@GetMapping("/cliente/v1/listar")
	public List<Cliente> listarClientesSeleccionados();

}
