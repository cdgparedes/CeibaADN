package co.com.ceiba.tiquetes.cesar.grajales.controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.com.ceiba.tiquetes.cesar.grajales.dominio.Pelicula;
import co.com.ceiba.tiquetes.cesar.grajales.repository.PeliculaRepository;
import co.com.ceiba.tiquetes.cesar.grajales.servicios.PeliculaServiceImplement;

@RestController
public class PeliculaControlador {

	@Autowired
	private PeliculaServiceImplement srvPelicula;

	public PeliculaControlador(PeliculaServiceImplement srvPelicula) {
		super();
		this.srvPelicula = srvPelicula;
	}

	/*@RequestMapping(value = "/peliculas", method = RequestMethod.GET)
	public List<Pelicula> findAll(@RequestParam(required = false) String nombrePelicula){
		List<Pelicula> peliculas = new ArrayList<>();
		
		if (nombrePelicula == null ) {//Validamos si el parametro tiene algo si es iguasl anull entonces retornamos toas la peliculas 
			Iterable<Pelicula> results = this.peliculaRepository.findAll();
			results.forEach(pelicula ->{
				peliculas.add(pelicula);
			});	
		}else {
			Pelicula pelicula = this.peliculaRepository.findBynombrePelicula(nombrePelicula);
			if (pelicula != null) {
				peliculas.add(pelicula);
			}
		}
		return peliculas;
			
		}*/
	
	@GetMapping("/lista-peliculas")
	public List<Pelicula> obtenerPeliculas(){
		List<Pelicula> peliculas = new ArrayList<>();
		peliculas = srvPelicula.obtenerListaPeliculas();
		for (Pelicula pelicula : peliculas) {
			System.out.print(pelicula);
		}
		return peliculas;
	}

}