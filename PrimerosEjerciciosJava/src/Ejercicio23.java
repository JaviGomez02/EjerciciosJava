import java.util.Scanner;

public class Ejercicio23 {

	public static Scanner teclado= new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(ejercicio23());
	}

	public static String ejercicio23() {
		int contador=0, num=0;
		
		while (num>=0) {
			num=leerEntero("Introduce un numero");
			if (num>=0) {
				contador=contador+1;
			}
		}
		return "Se han introducido "+contador+" numeros";
		
	}
	public static int leerEntero(String texto) {
		System.out.println(texto);
		return Integer.parseInt(teclado.nextLine());
	}
	
}
