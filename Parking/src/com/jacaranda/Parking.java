package com.jacaranda;

import java.util.Objects;

/**
 * Clase parking
 * @author Javi Gómez
 * @version 1.0
 *
 */

public class Parking {

	//Atributos
	/**
	 * Nombre del parking
	 */
	private String nombre;
	/**
	 * Categoría del parking
	 */
	private Categoria categoria;
	/**
	 * Numero de plazas del parking
	 */
	private int numPlazas;
	/**
	 * Numero de plazas ocupadas del parking
	 */
	private int numPlazasOcupadas;
	/**
	 * Código del parking que se asigna automáticamente
	 */
	private int codigo=0;
	/**
	 * Código para el siguiente parking
	 */
	private static int codigoSig=1;
	/**
	 * Recaudación del parking
	 */
	private double recaudacion;
	
	//Constructores
	/**
	 * Constructor de Parking
	 * @param nombre del parking
	 * @param categoria del parking
	 * @param numPlazas de plazas del parking
	 * @throws ParkingException si el numero de plazas es negativo
	 */
	public Parking(String nombre, Categoria categoria, int numPlazas) throws ParkingException {
		if (numPlazas<0) {
			throw new ParkingException("Numero de plazas incorrecto");
		}

		this.codigo=codigoSig++;
		this.nombre=nombre;
		this.categoria=categoria;
		this.numPlazas=numPlazas;
		this.numPlazasOcupadas=0;
		this.recaudacion=0;
	}

	
	
	//Métodos
	/**Devuelve el nombre del parking
	 * 
	 * @return nombre del parking
	 */
	public String getNombre() {
		return nombre;
	}
	/**Le ponemos un nombre al parking
	 * 
	 * @param nombre que le damos al parking
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**Devuelve la categoria del parking
	 * 
	 * @return categoria del parking
	 */
	public Categoria getCategoria() {
		return categoria;
	}
	/**Le ponemos una categoria al parking
	 * 
	 * @param categoria del parking
	 */
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	/**Devuelve el numero de plazas ocupadas
	 * 
	 * @return numPlazasOcupadas el numero de plazas ocupadas
	 */
	public int getNumPlazasOcupadas() {
		return numPlazasOcupadas;
	}
	/**Insertamos el número de plazas ocupadas
	 * 
	 * @param numPlazasOcupadas el numero de plazas ocupadas
	 */
	public void setNumPlazasOcupadas(int numPlazasOcupadas) {
		this.numPlazasOcupadas = numPlazasOcupadas;
	}
	
	/**Devuelve el código del parking
	 * 
	 * @return codigo del parking
	 */
	public int getCodigo() {
		return codigo;
	}
	/**Insertamos el código del parking
	 * 
	 * @param codigo del parking
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	/**Devuelve el número de plazas del parking
	 * 
	 * @return el numero de plazas del parking
	 */
	public int getNumPlazas() {
		return numPlazas;
	}
	/**Devuelve la recaudación obtenida
	 * 
	 * @return la recaudacion obtenida en total
	 */
	public double getRecaudacion() {
		return recaudacion;
	}
	/**
	 * Metodo para cuando sales del parking
	 * @param minutos que ha pasado en el parking
	 * @return el precio que te cobra al salir
	 * @see Double
	 */
	public double cobrarYsalirDelParking(double minutos) {
		double resultado=minutos*categoria.getPrecioMinuto();
		this.recaudacion=this.recaudacion+resultado;
		this.numPlazasOcupadas=this.numPlazasOcupadas-1;
		return resultado;
	}
	/**Método para entrar en el parking
	 * 
	 * @throws ParkingException cuando el parking esta totalmente lleno
	 */
	public void entrarParking() throws ParkingException {
		if (this.numPlazasOcupadas==this.numPlazas) {
			throw new ParkingException("Parking lleno");
		}
		
		this.numPlazasOcupadas=this.numPlazasOcupadas+1;
	}

	/**Método para clonar un parking
	 * 
	 * @param cadena nuevo nombre del parking
	 * @return un clon de parking
	 * @throws ParkingException excepcion
	 */
	public Parking clonarParking(String cadena) throws ParkingException {
		Parking clon=new Parking(cadena,this.categoria,this.numPlazas);
		
		return clon;
	}


	
	@Override
	public String toString() {
		return "Parking [nombre=" + nombre + ", categoria=" + categoria + ", numPlazas=" + numPlazas
				+ ", numPlazasOcupadas=" + numPlazasOcupadas + ", codigo=" + codigo + ", recaudacion=" + recaudacion
				+ "]";
	}


	
	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}


	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parking other = (Parking) obj;
		return codigo == other.codigo;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
