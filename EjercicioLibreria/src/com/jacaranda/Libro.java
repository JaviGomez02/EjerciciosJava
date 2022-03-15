package com.jacaranda;

import java.time.LocalDate;
import java.util.Objects;

public class Libro {

	protected String titulo;
	protected String autor;
	protected String editorial;
	protected LocalDate fechaEdicion;
	protected String isbn;
	protected int codigo=0;
	protected static int codigoSiguiente=1;
	public Libro(String titulo, String autor, String editorial) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
		this.codigo=codigoSiguiente++;
		this.isbn=generarIsbn();
		this.fechaEdicion=LocalDate.now();
	}
	public Libro(String titulo, String autor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.codigo=codigoSiguiente++;
		this.isbn=generarIsbn();
		this.fechaEdicion=LocalDate.now();
	}
	
	public String generarIsbn() {
		String resultado;
		resultado=this.titulo.substring(0, 3) + this.titulo.length()+this.autor.substring(autor.length()-3, autor.length());
		return resultado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(isbn, other.isbn);
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public LocalDate getFechaEdicion() {
		return fechaEdicion;
	}
	public void setFechaEdicion(LocalDate fechaEdicion) {
		this.fechaEdicion = fechaEdicion;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getAutor() {
		return autor;
	}
	public String getIsbn() {
		return isbn;
	}
	public int getCodigo() {
		return codigo;
	}
	@Override
	public String toString() {
		return "Libro: " + titulo + ". Autor: " + autor + ". ISBN: " + isbn + ". Código: "+codigo;
	}
	
	
	
	
	
	
	
	
	
}
