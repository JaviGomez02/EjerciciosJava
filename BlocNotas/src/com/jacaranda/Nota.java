package com.jacaranda;

import java.time.LocalDateTime;
import java.util.Objects;

public class Nota implements Comparable<Nota>{

	protected static int codigoSiguiente=1;
	protected int codigo=0;
	protected String texto;
	protected LocalDateTime fechaCreacion;
	protected LocalDateTime fechaUltimaModificacion;
	
	public Nota(String texto) {
		super();
		this.texto = texto;
		this.fechaCreacion=LocalDateTime.now();
		this.codigo=codigoSiguiente++;
		this.fechaUltimaModificacion=this.fechaCreacion;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
		this.fechaUltimaModificacion=LocalDateTime.now();
	}
	public int getCodigo() {
		return codigo;
	}
	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}
	public LocalDateTime getFechaUltimaModificacion() {
		return fechaUltimaModificacion;
	}
	
	public boolean isCreadoAnterior(Nota nota) throws NotaException {
		if (nota==null) {
			throw new NotaException("Los valores no pueden ser nulos");
		}
		boolean resultado;
		if (nota.fechaCreacion.isBefore(this.getFechaCreacion())) {
			resultado=true;
		}
		else {
			resultado=false;
		}
		return resultado;
	}
	
	public boolean isModificado() {
		boolean resultado;
		if (this.fechaUltimaModificacion.equals(fechaCreacion)) {
			resultado=false;
		}
		else {
			resultado=true;
		}
		return resultado;
	}
	public boolean isEmpty(){
		boolean resultado=false;
		if (this.texto=="") {
			resultado=true;
		}
		return resultado;
	}
	public boolean isModificadoAnterior(Nota nota) throws Exception {
		if (nota==null) {
			throw new Exception("Los valores no pueden ser nulos");
		}
		boolean resultado=false;
		if (nota.fechaUltimaModificacion.isBefore(this.fechaUltimaModificacion)) {
			resultado=true;
		}
		return resultado;
	}
	
	@Override
	public String toString() {
		return "Nota [codigo=" + codigo + ", texto=" + texto + ", fechaCreacion=" + fechaCreacion
				+ ", fechaUltimaModificacion=" + fechaUltimaModificacion + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(fechaCreacion, texto);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nota other = (Nota) obj;
		return Objects.equals(fechaCreacion, other.fechaCreacion) && Objects.equals(texto, other.texto);
	}
	
	@Override
	public int compareTo(Nota o) {
		int resultado=this.texto.compareToIgnoreCase(o.getTexto());
		
		if (resultado==0) {
			resultado=this.getFechaCreacion().compareTo(o.getFechaCreacion());
		}		
		
		return resultado;
	}
	
	public Nota clone() {
		Nota n=new Nota(this.getTexto());
		n.codigo=this.getCodigo();
		n.fechaCreacion=this.getFechaCreacion();
		n.fechaUltimaModificacion=this.fechaUltimaModificacion;
		return n;
	}
	
	
	
	
	
	
	
}
