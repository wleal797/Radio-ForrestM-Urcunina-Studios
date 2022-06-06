package co.edu.unbosque.model.persistence;

import java.io.Serializable;

public class RegistroCancionesDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String codigo;
	private String genero;
	private String autor;
	private String nombre;

	public RegistroCancionesDTO(String genero, String nombre, String autor, String codigo) {

		this.genero = genero;
		this.nombre = nombre;
		this.autor = autor;
		this.codigo = codigo;

	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String toString() {
		return "[" + genero + ",  " + autor + ",  " + nombre + "]";
	}

}
