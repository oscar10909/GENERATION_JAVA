package paquete2;

import paquete1.ClaseDefault;

public class ClasePrivada {
	//atributos
	private String nombre;
	private int edad;
	
	//m�todos
	public void setSaludar(String nombre) {//fijar o modificar un valor
		this.nombre = nombre;
	}
	
	public String getSaludar() {
		return nombre;
	}
}
