import java.util.Scanner;

public class MetodosLeer {

	public static Scanner teclado= new Scanner(System.in);
	
	public static void main(String[] args) {
	

	}
	
	public static String leerCadena(String texto) {
		System.out.println(texto);
		return teclado.nextLine();
	}
	
	public static int leerEntero(String texto) {
		System.out.println(texto);
		return Integer.parseInt(teclado.nextLine());
	}
	
	public static double leerReal(String texto) {
		System.out.println(texto);
		return Double.parseDouble(teclado.nextLine());
	}

	public static char leerCaracter(String texto) {
		System.out.println(texto);
		return teclado.nextLine().charAt(0);
	}

}
