package com.jacaranda.vehiculo;

import java.time.LocalDate;

public class Furgoneta extends Vehiculo {

	private double peso;
	private static final double PRECIO_POR_PESO=0.5;
	public Furgoneta(String matricula, String gama, LocalDate fechaSalida, double peso) throws VehiculoException {
		super(matricula, gama, fechaSalida);
		this.peso = peso;
	}
	public double getPeso() {
		return peso;
	}
	
	public double getPrecioPorPeso() {
		return PRECIO_POR_PESO;
	}
	public double getPrecio() {
		double resultado=super.getPrecio()+PRECIO_POR_PESO*this.peso;
		
		return resultado;
	}
	@Override
	public String toString() {
		return "Furgoneta [peso=" + peso + ", precioPorPeso=" + PRECIO_POR_PESO + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	
	
	
	
	
}
