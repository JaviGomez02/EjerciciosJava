package com.jacaranda;

public class Main {

	public static void main(String[] args) throws NotaException {
		// TODO Auto-generated method stub

		Nota n1=new Nota("Hola");
		Nota n2=new Nota("Adios");

		System.out.println(n1.toString());
		n1.setTexto("Hola que tal");
		System.out.println(n1.isModificado());
		System.out.println(n1.toString());
		System.out.println(n2.toString());
		System.out.println(n1.isCreadoAnterior(n2));
		
		
		
		
		
	}

}
