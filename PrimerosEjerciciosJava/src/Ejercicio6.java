import java.util.Scanner;

public class Ejercicio6 {

	public static Scanner teclado= new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int dia,mes;
		
		dia=leerEntero("Introduce un dia");
		mes=leerEntero("Introduce un mes (1-12)");
		
		System.out.println(ejercicio6(dia,mes));

	}

	public static int leerEntero(String texto) {
		System.out.println(texto);
		return Integer.parseInt(teclado.nextLine());
	}
	
	public static String ejercicio6(int dia, int mes) {
		String resultado=null;
		if ((mes==3 && dia>=20)||(mes>3 && mes<6)||(mes==6 && dia<=21)) {
			resultado="20º";
		}
		else if ((mes==6 && dia>21)||(mes>6 && mes<9)||(mes==9 && dia<=23)) {
			resultado="24º";
		}
		
		else {
			resultado="19º";
		}
		
		return resultado;
		
		
	}
}
