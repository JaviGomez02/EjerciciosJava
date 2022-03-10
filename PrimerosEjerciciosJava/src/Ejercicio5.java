import java.util.Scanner;

public class Ejercicio5 {

	public static Scanner teclado= new Scanner(System.in);
	
	public static void main(String[] args) {
		int hora=-1;

		while (hora<0 || hora>24) {
			hora=leerEntero("Introduce una hora");
			if (hora<0 || hora>24) {
				System.out.println("Debes introducir una hora del 0 al 24");
			}
		}
		System.out.println(ejercicio5(hora));
	}

	
	public static String ejercicio5(int hora) {
		String resultado = null;
		if (hora>=6 && hora<=12) {
			resultado="Buenos días";
		}
		else if (hora>=13 && hora<=20) {
			resultado="Buenas tardes";
		}
		else {
			resultado="Buenas noches";
		}
		
		return resultado;
	}
	
	public static int leerEntero(String texto) {
		System.out.println(texto);
		return Integer.parseInt(teclado.nextLine());
	}
}


