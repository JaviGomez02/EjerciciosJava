package com.jacaranda;

import java.util.Arrays;
import java.util.Objects;

public class Bloc {

	private static final int NUMERO_NOTAS_MAXIMA = 50;
	private int numNotas;
	private String nombre;
	private Nota[] notas;
	
	
	public Bloc(String nombre) throws BlocException {
		super();
		if (nombre=="") {
			throw new BlocException("El nombre no puede estar vacio");
		}
		this.nombre = nombre;
		this.numNotas=0;
		this.notas=new Nota[NUMERO_NOTAS_MAXIMA];
	}

	public String getNotas(int numero) throws BlocException {
		if (numero>=numNotas) {
			throw new BlocException("Introduce un valor correcto");

		}
		return notas[numero].getTexto();
	}

	public void updateNota(int numero, String texto) throws BlocException {
		if (texto=="") {
			throw new BlocException("No puedes poner una nota vacia");
		}
		this.notas[numero].setTexto(texto);
	}

	public void activa(int numero) throws BlocException {
		if (numero>=numNotas) {
			throw new BlocException("Introduce un valor correcto");
		}
		NotaAlarma n1;
		if (this.notas[numero] instanceof NotaAlarma) {
			n1=(NotaAlarma)notas[numero];
			n1.activar();
		}
		else {
			throw new BlocException("La nota introducida no tiene alarma");
		}
		
	}
	
	public void desactiva(int numero) throws BlocException {
		if (numero>=numNotas) {
			throw new BlocException("Introduce un valor correcto");
		}
		NotaAlarma n1;
		if (this.notas[numero] instanceof NotaAlarma) {
			n1=(NotaAlarma)notas[numero];
			n1.desactivar();
		}
		else {
			throw new BlocException("La nota introducida no tiene alarma");
		}
	}
 
	public static int getNumeroNotasMaxima() {
		return NUMERO_NOTAS_MAXIMA;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "Bloc [numNotas=" + numNotas + ", nombre=" + nombre + ", notas=" + Arrays.toString(notas) + "]";
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
		Bloc other = (Bloc) obj;
		return Objects.equals(nombre, other.nombre);
	}
	
	public String ordenaBloc() {
		Nota[] notasAuxiliar=new Nota[numNotas];
		StringBuilder resultado=new StringBuilder();
		for (int i = 0; i < numNotas; i++) {
			notasAuxiliar[i]=notas[i].clone();
		}
		Arrays.sort(notasAuxiliar);
		for (int i = 0; i < numNotas; i++) {
			resultado.append(notasAuxiliar[i]+"\n");
		}
		return resultado.toString();
	}
	
	public void annadirNota(String texto) throws BlocException {
		if (texto=="") {
			throw new BlocException("No puedes poner una nota vacia");
		}
		this.notas[numNotas]=new Nota(texto);
		numNotas++;
	}
	
	public void borrarNota(int numero) throws BlocException {
		if (numero>=numNotas) {
			throw new BlocException("La posicion no es correcta");
		}
		notas[numero]=null;
		for (int i = numero; i < numNotas; i++) {
			notas[i]=notas[i+1];
		}
		numNotas--;
	}
	
	
	
	
}
