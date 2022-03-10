import java.util.Scanner;

public class Ejercicio19 {

	public static Scanner teclado= new Scanner(System.in);
	
	public static void main(String[] args) {
		

		System.out.println(ejercicio19());

	}

	public static int ejercicio19() {
		int resultado=0,num;
		
		for (int i = 0; i <15; i++) {
			num=leerEntero("Introduce un numero");
			resultado=resultado+num;
		}
		
		return resultado;
	}
	
	public static int leerEntero(String texto) {
		System.out.println(texto);
		return Integer.parseInt(teclado.nextLine());
	}
}
