CREATE TABLE pelicula(
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
	nombre_pelicula VARCHAR(30) NOT NULL,
	genero VARCHAR(30) NOT NULL,
	detalle VARCHAR(200) NOT NULL
);