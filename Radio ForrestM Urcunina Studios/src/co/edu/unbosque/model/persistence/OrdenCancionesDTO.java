package co.edu.unbosque.model.persistence;

import java.io.Serializable;

public class OrdenCancionesDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private int codigoCancion;

	public OrdenCancionesDTO(int codigoCancion) {

		this.codigoCancion = codigoCancion;

	}

	public int getCodigoCancion() {
		return codigoCancion;
	}

	public void setCodigoCancion(int codigoCancion) {
		this.codigoCancion = codigoCancion;
	}

	public String toString() {
		String codigo = Integer.toString(codigoCancion);
		return codigo;
	}

}
