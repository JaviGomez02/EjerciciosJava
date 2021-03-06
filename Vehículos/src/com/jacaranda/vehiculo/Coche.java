package com.jacaranda.vehiculo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Coche extends Vehiculo {

	private CarburanteEnumerado carburante;

	public Coche(String matricula, String gama, LocalDate fechaSalida, String carburante)
			throws VehiculoException {
		super(matricula, gama, fechaSalida);
		this.carburante = CarburanteEnumerado.valueOf(carburante.toUpperCase());
	}

	public String getCarburante() {
		return carburante.toString();
	}

	public void setCarburante(String carburante) {
		this.carburante = CarburanteEnumerado.valueOf(carburante.toUpperCase());
	}

	@Override
	public String toString() {
		return "Coche [carburante=" + carburante + ", toString()=" + super.toString() + "]";
	}

	public double getPrecio() {
		double resultado=super.getPrecio()+this.carburante.getPrecio()*this.getFechaEntrada().until(this.getFechaSalida(), ChronoUnit.DAYS);
		return resultado;
	}
	
	
	
}
