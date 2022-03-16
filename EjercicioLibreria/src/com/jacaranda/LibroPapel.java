package com.jacaranda;

public class LibroPapel extends Libro {

	private double precio;
	private double peso;
	public LibroPapel(String titulo, String autor, String editorial, double precio, double peso) {
		super(titulo, autor, editorial);
		this.precio = precio;
		this.peso = peso;
	}
	@Override
	public String toString() {
		return super.toString()+". Precio: "+precio+". Peso: "+peso;
	}
	public double getPrecio() {
		return precio;
	}
	public double getPeso() {
		return peso;
	}
	
	public boolean esMasCaro(LibroDigital lg) {
		boolean resultado=false;
		if (this.getPrecio()>lg.getPrecio()) {
			resultado=true;
		}
		return resultado;
	}
	
}
