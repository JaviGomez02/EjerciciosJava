package com.jacaranda;

public class LibroDigital extends Libro {

	private double precio;
	private FormatoEnum formato;
	public LibroDigital(String titulo, String autor, String editorial, double precio, FormatoEnum formato) {
		super(titulo, autor, editorial);
		this.precio = precio;
		this.formato = formato;
	}
	public double getPrecio() {
		return precio;
	}
	public FormatoEnum getFormato() {
		return formato;
	}
	@Override
	public String toString() {
		return super.toString()+". Precio: "+precio+". Formato: "+formato;
	}
	
	
}
