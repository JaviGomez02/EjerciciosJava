import java.util.Scanner;

public class Ejercicio24 {
	public static Scanner teclado= new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println(ejercicio24());
		

	}
	
	
	
	public static String ejercicio24() {
		int resultado=0;
		int num=0;
		
		for (int i = 0; i < 10; i++) {
			num=leerEntero("Introduce un numero");
			if (num>resultado) {
				resultado=num;
			}
		}
		return "El mayor numero es "+resultado;
	}
	
	
	public static int leerEntero(String texto) {
		System.out.println(texto);
		return Integer.parseInt(teclado.nextLine());
	}
	
	
	
}
