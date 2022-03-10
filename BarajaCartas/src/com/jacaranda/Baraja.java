package com.jacaranda;

public class Baraja {

	private int numCartas;
	private int siguiente;
	private Carta[] cartas=new Carta[40];
	
	public Baraja() {
		super();
	}
	
	public void barajar() {
		String[] palos=new String[] {"Espadas","Oro","Copas","Bastos"};
		
		for (int i = 0; i < cartas.length; i++) {
			int numero=(int) (Math.random()*11);
			int numeroPalos=(int) (Math.random()*4);
			if(numero>0 && numero<11 && numeroPalos>=0 && numeroPalos<=3) {
				cartas[i]=new Carta(numero, palos[numeroPalos]);
			}
			
		}
	}

	
	
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Baraja [numCartas=" + numCartas + ", siguiente=" + siguiente + "]";
	}
	
	
	
	
}
