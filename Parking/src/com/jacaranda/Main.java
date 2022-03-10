package com.jacaranda;

import java.util.Scanner;


public class Main {

	public static Scanner teclado= new Scanner(System.in);

	public static void main(String[] args) throws ParkingException {
		Categoria c1=new Categoria("Categoria 1",1);
		Parking p1=new Parking("Parking Lora",c1,50);
		
		
		boolean salir=false;
		while (salir!=true) {
			int opcion=leerEntero("1-Entrar al parking, 2-Salir del parking, 3-Mostrar información, 4-Salir del programa");
			switch (opcion) {
			case 1: {
				p1.entrarParking();
				break;
			}
			case 2: {
				p1.cobrarYsalirDelParking(leerEntero("Introduce los minutos"));
				break;
			}
			case 3: {
				System.out.println(p1.toString());
				break;
			}
			case 4: {
				salir=true;
				System.out.println("Apagando programa");
				break;
			}
			default:
				break;
			}
		}
		
		
		
		

	}

	public static int leerEntero(String texto) {
		System.out.println(texto);
		return Integer.parseInt(teclado.nextLine());
	}
}
