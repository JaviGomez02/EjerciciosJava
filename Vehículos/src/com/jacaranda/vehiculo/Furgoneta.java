package com.jacaranda.vehiculo;

import java.time.LocalDate;

public class Furgoneta extends Vehiculo {

	private double peso;
	private final double precioPorPeso=0.5;
	public Furgoneta(String matricula, String gama, LocalDate fechaSalida, double peso) throws VehiculoException {
		super(matricula, gama, fechaSalida);
		this.peso = peso;
	}
	public double getPeso() {
		return peso;
	}
	
	public double getPrecioPorPeso() {
		return precioPorPeso;
	}
	public double getPrecio() {
		double resultado=super.getPrecio()+this.precioPorPeso*this.peso;
		
		return resultado;
	}
	@Override
	public String toString() {
		return "Furgoneta [peso=" + peso + ", precioPorPeso=" + precioPorPeso + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	
	
	
	
	
}
