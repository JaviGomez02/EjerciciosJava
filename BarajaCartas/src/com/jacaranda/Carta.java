package com.jacaranda;

import java.util.Objects;

public class Carta {

	private int number;
	private String palo;
	
	public Carta(int number, String palo) {
		super();
		this.number = number;
		this.palo = palo;
	}

	public int getNumber() {
		return number;
	}

	public String getPalo() {
		return palo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(number, palo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta other = (Carta) obj;
		return number == other.number && Objects.equals(palo, other.palo);
	}

	@Override
	public String toString() {
		return "Carta [number=" + number + ", palo=" + palo + "]";
	}
	
	public double getValor() throws CartaException {
		if (this.number<1 || this.number>10) {
			throw new CartaException("El número debe ser del 1 al 10");
		}
		double valor;
		if (this.number<=7) {
			valor=this.number;
		}
		else {
			valor=0.5;
		}
		return valor;
	}
	
}
