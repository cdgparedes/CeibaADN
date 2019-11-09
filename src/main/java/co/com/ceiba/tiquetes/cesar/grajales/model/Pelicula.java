package co.com.ceiba.tiquetes.cesar.grajales.model;

public class Pelicula {
	public String nombre_pelicula;
	public String genero;
	public String detalle;

	public Pelicula() {

	}

	public Pelicula(String nombre_pelicula, String genero, String detalle) {
		super();
		this.nombre_pelicula = nombre_pelicula;
		this.genero = genero;
		this.detalle = detalle;
	}

	public String getNombre_pelicula() {
		return nombre_pelicula;
	}

	public void setNombre_pelicula(String nombre_pelicula) {
		this.nombre_pelicula = nombre_pelicula;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

}