import java.util.Scanner;

public class Ejercicio25 {
	
	public static Scanner teclado= new Scanner(System.in);

	public static void main(String[] args) {
		// Realiza un programa que vaya pidiendo números hasta que se introduzca un número negativo
		//y nos diga cuantos números se han introducido, la media de los impares y
		//el mayor de los pares. El número negativo sólo se utiliza para indicar el final
		//de la introducción de datos pero no se incluye en el cómputo.
		
		int num=0,contador=0,contadorImpar=0,totalImpar=0,mediaImpar,var=0,mayorPar=0;
		while (num>=0) {
			num=leerEntero("Introduce un numero");
			if (num>=0) {
				contador++;
				if (impar(num)==true) {
					contadorImpar++;
					totalImpar=totalImpar+num;
				}
				else {
					mayorPar=mayor(num,var);
				}
			}	
		}
		System.out.println("Se han introducido un total de "+contador+" numeros");
		mediaImpar=totalImpar/contadorImpar;
		System.out.println("La media de los impares es "+mediaImpar);
		System.out.println("El mayor de los pares es "+mayorPar);
	}

	public static boolean impar(int num) {
		boolean resultado=false;
		if (num%2!=0) {
			resultado=true;
		}
		return resultado;
	}
	
	public static int mayor(int num, int mayorPar) {
		if (num>mayorPar) {
			mayorPar=num;
		}
		return mayorPar;
		
	}
	
	
	public static int leerEntero(String texto) {
		System.out.println(texto);
		return Integer.parseInt(teclado.nextLine());
	}
	
}
