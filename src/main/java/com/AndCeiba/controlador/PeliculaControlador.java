package com.AndCeiba.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeliculaControlador {
	
	@GetMapping("/")
	public String holaMundo() {
		return "Hola esta es mi pelicula";
	}

}
