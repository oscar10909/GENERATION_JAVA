package com.gatitos;

public class Gato {
	//atributos
	private String nombre;
	private int patas;
	private boolean adoptado;
	
	//getter y setter, deben ser public
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getPatas() {
		return this.patas;
	}
	
	public void setPatas(int patas) {
		if(patas >= 0 && patas < 5) {
			this.patas = patas;
		}else {
			throw new IllegalArgumentException("El número de patas no es válido");
		}
	}
	
	public boolean isAdoptado() {
		return this.adoptado;
	}
	
	public void setAdoptado(boolean adoptado) {
		this.adoptado = adoptado;
	}
	//método toString

	@Override
	public String toString() {
		return "Gato [nombre=" + nombre + ", patas=" + patas + ", adoptado=" + adoptado + "]";
	}
	
}
