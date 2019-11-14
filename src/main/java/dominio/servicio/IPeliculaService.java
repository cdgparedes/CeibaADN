package dominio.servicio;

import java.util.List;

import dominio.entidad.Pelicula;

public interface IPeliculaService {
	public List<Pelicula> obtenerListaPeliculas();
}