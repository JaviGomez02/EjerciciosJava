package com.jacaranda;

import java.util.Objects;

public class Personaje {

	private String nombre;
	private Pelicula primeraPelicula;
	private int poder;
	private double estatura;
	private double peso;
	private String especie;
	public Personaje(String nombre, double estatura, double peso, String especie) {
		super();
		this.nombre = nombre;
		this.estatura = estatura;
		this.peso = peso;
		this.especie = especie;
	}
	public Personaje(String nombre, Pelicula primeraPelicula, int poder, double estatura, double peso, String especie) throws PersonajeException {
		super();
		if (poder<0 || poder>100) {
			throw new PersonajeException("Poder incorrecto");
		}
		this.nombre = nombre;
		this.primeraPelicula = primeraPelicula;
		this.poder = poder;
		this.estatura = estatura;
		this.peso = peso;
		this.especie = especie;
	}
	public String getNombre() {
		return nombre;
	}
	public Pelicula getPrimeraPelicula() {
		return primeraPelicula;
	}
	public int getPoder() {
		return poder;
	}
	public double getEstatura() {
		return estatura;
	}
	public double getPeso() {
		return peso;
	}
	public String getEspecie() {
		return especie;
	}
	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", primeraPelicula=" + primeraPelicula + ", poder=" + poder
				+ ", estatura=" + estatura + ", peso=" + peso + ", especie=" + especie + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(especie, estatura, nombre, peso, poder, primeraPelicula);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personaje other = (Personaje) obj;
		return Objects.equals(especie, other.especie)
				&& Double.doubleToLongBits(estatura) == Double.doubleToLongBits(other.estatura)
				&& Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(peso) == Double.doubleToLongBits(other.peso) && poder == other.poder
				&& Objects.equals(primeraPelicula, other.primeraPelicula);
	}
	public void setPrimeraPelicula(Pelicula primeraPelicula) {
		this.primeraPelicula = primeraPelicula;
	}
	
	
	
	
	
	
	
}
