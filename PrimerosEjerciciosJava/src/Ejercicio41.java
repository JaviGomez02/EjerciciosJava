import java.util.Scanner;

public class Ejercicio41 {
	
	public static Scanner teclado= new Scanner(System.in);

	public static void main(String[] args) {
		//Realiza un programa que pida un número por teclado y que luego muestre ese número al revés.
		//Utilizar cadenas para facilitar la tarea
		int num;
		num=leerEntero("Introduce un número");
		System.out.println(ejercicio41(num));
		
	}

	public static int leerEntero(String texto) {
		System.out.println(texto);
		return Integer.parseInt(teclado.nextLine());
	}
	public static String ejercicio41(int num) {
		String cadena, cadenaNueva="";
		cadena=String.valueOf(num);
		for (int i = cadena.length(); i > 0; i=i-1) {
			cadenaNueva=cadenaNueva+cadena.charAt(i-1);
		}
		
		return cadenaNueva;
	}

}
