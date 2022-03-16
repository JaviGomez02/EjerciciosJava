package com.jacaranda;

import java.util.Scanner;

public class Main {
	public static Scanner teclado= new Scanner(System.in);


	public static void main(String[] args) {


		Libro array[]=new Libro[50];
		int numLibros=0;
		int var=0;
		while (var==0) {
			int opcion=leerEntero("1: Añadir libro. 2: Borrar libro. 3: Ver informacion de libros. 4: Salir");
			switch (opcion) {
			case 1: {
				int opc=leerEntero("1: Añadir libro digittal. 2: Añadir libro de papel");
				if (opc==1) {
					String autor=leerCadena("Introduce un autor");
					String titulo=leerCadena("Introduce un titulo");
					String editorial=leerCadena("Introduce una editorial");
					double precio=leerReal("Introduce un precio para el libro");
					String formato=leerCadena("Introduce un formato");
					array[numLibros]=new LibroDigital(titulo,autor,editorial,precio,formato);
					numLibros++;
				}
				else if (opc==2) {
					String autor=leerCadena("Introduce un autor");
					String titulo=leerCadena("Introduce un titulo");
					String editorial=leerCadena("Introduce una editorial");
					double precio=leerReal("Introduce un precio para el libro");
					double peso=leerReal("Introduce el peso del libro");
					array[numLibros]=new LibroPapel(titulo,autor,editorial,precio,peso);
					numLibros++;
				}
				else {
					System.out.println("Opcion incorrecta");
				}
				
				break;
			}
			case 2: {
				String nombre=leerCadena("Introduce el titulo del libro que quieres borrar");
				boolean encontrado=false;
				for (int i = 0; i < numLibros && encontrado==false; i++) {
					if (array[i].getTitulo().equals(nombre)) {
						encontrado=true;
						array[i]=null;
						for (int j = i; j < numLibros; j++) {
							array[j]=array[j+1];
						}
						numLibros=numLibros-1;
					}
				}
				break;
			}
			case 3: {
				StringBuilder resultado=new StringBuilder("");
				for (int i = 0; i < numLibros; i++) {
					resultado.append(array[i].toString()+"\n"); 
				}
				System.out.println(resultado.toString());
				break;
			}
			case 4: {
				var=1;
				System.out.println("Saliendo");
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcion);
			}
		}
	}
	

	public static int leerEntero(String texto) {
		System.out.println(texto);
		return Integer.parseInt(teclado.nextLine());
	}
	public static String leerCadena(String texto) {
		System.out.println(texto);
		return teclado.nextLine();
	}
	public static double leerReal(String texto) {
		System.out.println(texto);
		return Double.parseDouble(teclado.nextLine());
	}
}