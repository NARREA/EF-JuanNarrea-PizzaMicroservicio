package com.idat.pizzaservicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class EfJuanNarreaPizzaMicroservicio2Application {

	public static void main(String[] args) {
		SpringApplication.run(EfJuanNarreaPizzaMicroservicio2Application.class, args);
	}

}
