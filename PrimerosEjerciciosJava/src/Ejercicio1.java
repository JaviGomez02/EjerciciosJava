import java.util.Scanner;

public class Ejercicio1 {

	public static Scanner teclado= new Scanner(System.in);
	
	public static void main(String[] args) {

		
		System.out.println(ejercicio1());
	}

	
	
	public static Boolean ejercicio1() {
		Boolean resultado;
		int num1,num2;
		num1=leerEntero("Introduce el primer numero");
		num2=leerEntero("Introduce el segundo numero");
		if (num1%num2==0) {
			resultado=true;
		}
		else {
			resultado=false;
		}
		
		return resultado;
	}
	
	public static int leerEntero(String texto) {
		System.out.println(texto);
		return Integer.parseInt(teclado.nextLine());
	}
}
