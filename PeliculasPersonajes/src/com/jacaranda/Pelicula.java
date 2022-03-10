package com.jacaranda;

public class Pelicula {

	private String nombre;
	private int estreno;
	private Personaje personaje1;
	private Personaje personaje2;
	private Personaje personaje3;
	public Pelicula(String nombre, int estreno, Personaje personaje1, Personaje personaje2, Personaje personaje3) {
		super();
		this.nombre = nombre;
		this.estreno = estreno;
		this.personaje1 = personaje1;
		this.personaje2 = personaje2;
		this.personaje3 = personaje3;
	}
	public void setPersonaje1(Personaje personaje1) {
		this.personaje1 = personaje1;
	}
	public void setPersonaje2(Personaje personaje2) {
		this.personaje2 = personaje2;
	}
	public void setPersonaje3(Personaje personaje3) {
		this.personaje3 = personaje3;
	}
	public int poderPelicula() {
		int resultado=personaje1.getPoder()+personaje2.getPoder()+personaje3.getPoder();
		return resultado;
		
	}
	@Override
	public String toString() {
		return "Pelicula [nombre=" + nombre + ", estreno=" + estreno + ", personaje1=" + personaje1 + ", personaje2="
				+ personaje2 + ", personaje3=" + personaje3 + "]";
	}
	
	
	
	
}
