import java.util.Scanner;

public class Ejercicio27 {

	public static Scanner teclado= new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println(ejercicio27());
		
	}

	public static String ejercicio27() {
		String resultado="";
		int sueldo,sumaTotal=0,contador=0;
		for (int i = 0; i < 10; i++) {
			sueldo=leerEntero("Introduce un sueldo");
			sumaTotal=sumaTotal+sueldo;
			if (sueldo>1000) {
				contador++;
			}
		}
		resultado="La suma de los sueldos da un total de "+sumaTotal+" y hay "+contador+" sueldos mayores de 1000";

		return resultado;
	}
	
	
	public static int leerEntero(String texto) {
		System.out.println(texto);
		return Integer.parseInt(teclado.nextLine());
	}
	
	
	
}
