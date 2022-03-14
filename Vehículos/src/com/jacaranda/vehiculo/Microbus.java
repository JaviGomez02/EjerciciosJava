package com.jacaranda.vehiculo;

import java.time.LocalDate;

public class Microbus extends Vehiculo {

	private int numPlazas;
	private static final double PRECIO_POR_PLAZA=5;
	public Microbus(String matricula, String gama, LocalDate fechaSalida, int numPlazas) throws VehiculoException {
		super(matricula, gama, fechaSalida);
		this.numPlazas = numPlazas;
	}
	public int getNumPlazas() {
		return numPlazas;
	}
	public double getPrecioPorPlaza() {
		return PRECIO_POR_PLAZA;
	}
	
	public double getPrecio() {
		double resultado=super.getPrecio()+this.numPlazas*PRECIO_POR_PLAZA;
		return resultado;
	}
	
	
}
