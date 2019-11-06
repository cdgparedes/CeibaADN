package com.AndCeiba.repository;

import org.springframework.data.repository.CrudRepository;

import com.AndCeiba.dominio.Pelicula;

public interface PeliculaRepository  extends CrudRepository<Pelicula,Long>{
	Pelicula findBynombrePelicula(String nombrePelicula);
}
