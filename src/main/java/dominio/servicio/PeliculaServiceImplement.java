package dominio.servicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dominio.entidad.Pelicula;
import dominio.repositorio.PeliculaRepository;

@Service
public class PeliculaServiceImplement implements IPeliculaService {
	
	@Autowired
	private PeliculaRepository peliculaRepository;

	@Override
	public List<Pelicula> obtenerListaPeliculas() {
		try {
			return (List<Pelicula>) peliculaRepository.findAll();
		} catch (Exception e) {
			System.out.println("Error");
		}
		return null;		
	}

}
