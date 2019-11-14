package dominio.repositorio;

import org.springframework.data.repository.CrudRepository;

import co.com.ceiba.tiquetes.cesar.grajales.dominio.Pelicula;

public interface PeliculaRepository  extends CrudRepository<Pelicula,Long>{
	Pelicula findBynombrePelicula(String nombrePelicula);
}
