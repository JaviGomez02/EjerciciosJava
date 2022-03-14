package com.jacaranda;

import java.time.LocalDateTime;

public class NotaAlarma extends Nota implements Activable{

	private LocalDateTime fechaAlarma;
	private static final int MINUTOS_REPETIR_POR_DEFECTO=5;
	private int minutosRepetir;
	private boolean activado;
	
	public NotaAlarma(String texto, LocalDateTime fechaAlarma, Boolean activado) throws NotaAlarmaException {
		super(texto);
		if (this.fechaAlarma.isBefore(LocalDateTime.now())) {
			throw new NotaAlarmaException("La fecha de la alarma no puede ser anterior a la fecha actual");
		}
		this.fechaAlarma = fechaAlarma;
		this.minutosRepetir = MINUTOS_REPETIR_POR_DEFECTO;
		this.activado = activado;
	}

	public NotaAlarma(String texto, LocalDateTime fechaAlarma, int minutosRepetir) throws NotaAlarmaException {
		super(texto);
		if (this.fechaAlarma.isBefore(LocalDateTime.now())) {
			throw new NotaAlarmaException("La fecha de la alarma no puede ser anterior a la fecha actual");
		}
		if (minutosRepetir<=0) {
			throw new NotaAlarmaException("Los minutos deben ser mayor de 0");
		}
		
		this.fechaAlarma = fechaAlarma;
		this.minutosRepetir = minutosRepetir;
	}

	public static int getMinutosRepetirPorDefecto() {
		return MINUTOS_REPETIR_POR_DEFECTO;
	}

	private void setFechaAlarma(LocalDateTime fechaAlarma) throws NotaAlarmaException {
		if (this.fechaAlarma.isBefore(LocalDateTime.now())) {
			throw new NotaAlarmaException("La fecha de la alarma no puede ser anterior a la fecha actual");
		}
		this.fechaAlarma = fechaAlarma;
	}
	
	public void activar() {
		this.activado=true;
	}
	
	public void desactivar() {
		this.activado=false;
	}
	
	public boolean isActivado() {
		return this.activado;
	}

	@Override
	public String toString() {
		return "NotaAlarma [fechaAlarma=" + fechaAlarma + ", minutosRepetir=" + minutosRepetir + ", activado="
				+ activado + "]";
	}

	
	
}
