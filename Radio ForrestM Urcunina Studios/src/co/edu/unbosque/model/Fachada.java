package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.RegistroCancionesDAO;

public class Fachada {

	RegistroCancionesDAO registroCancionesDAO = new RegistroCancionesDAO();

	public RegistroCancionesDAO getRegistroCancionesDAO() {
		return registroCancionesDAO;
	}

	public void setRegistroCancionesDAO(RegistroCancionesDAO registroCancionesDAO) {
		this.registroCancionesDAO = registroCancionesDAO;
	}

}
