package com.jacaranda.vehiculo;

import java.time.LocalDate;

public class Microbus extends Vehiculo {

	private int numPlazas;
	private final double precioPorPlaza=5;
	public Microbus(String matricula, String gama, LocalDate fechaSalida, int numPlazas) throws VehiculoException {
		super(matricula, gama, fechaSalida);
		this.numPlazas = numPlazas;
	}
	public int getNumPlazas() {
		return numPlazas;
	}
	public double getPrecioPorPlaza() {
		return precioPorPlaza;
	}
	
	public double getPrecio() {
		double resultado=super.getPrecio()+this.numPlazas*this.precioPorPlaza;
		return resultado;
	}
	
	
}
