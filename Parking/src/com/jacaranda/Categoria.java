package com.jacaranda;

import java.util.Objects;
/**
 * Clase Categoria
 * @author Javi Gómez
 *
 */
public class Categoria {

	//Atributos
	/**
	 * Nombre de la categoria
	 */
	private String nombre;
	/**
	 * Precio por minuto de la categoria
	 */
	private double precioMinuto;
	
	//Constructorees
	/**
	 * Constructor de categoria
	 * @param nombre nombre de la categoria
	 * @param precioMinuto precio por minuto de la categoria
	 */
	public Categoria(String nombre, double precioMinuto) {
		this.nombre=nombre;
		this.precioMinuto=precioMinuto;
	}
	//Métodos
	/**
	 * Método para obtener el nombre
	 * @return el nombre de la categoria
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Método para insertar un nombre
	 * @param nombre nombre de la categoria
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Método para obtener el precio por minuto
	 * @return precio por minuto de la categoria
	 */
	public double getPrecioMinuto() {
		return precioMinuto;
	}
	/**
	 * Método para insertar el precio por minuto
	 * @param precioMinuto precio por minuto de la categoría
	 */
	public void setPrecioMinuto(double precioMinuto) {
		this.precioMinuto = precioMinuto;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Categoria [nombre=" + nombre + ", precioMinuto=" + precioMinuto + "]";
	}
	
	
	
	
}
