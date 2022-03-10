import java.util.Scanner;

public class HolaMundo {

	public static Scanner teclado= new Scanner(System.in);
	
	public static void main(String[] args) {
		// Declaracion de variables
		int a,b,resultado;
		char opc;
		System.out.println("Hola mundo");
		
		
		
		
		System.out.println("¿Quieres calcular la suma(S/N)?");
		opc=teclado.nextLine().charAt(0);
		if (opc=='S') {
			System.out.println("Introduce un número para a: ");
			a=Integer.parseInt(teclado.nextLine());
			System.out.println("Introduce otro número para b");
			b=Integer.parseInt(teclado.nextLine());
			
			resultado=a+b;
			System.out.println(resultado);
		}
		else if (opc=='N') {
			System.out.println("No se realiza la suma");
		}
		else {
			System.out.println("Vale tonto");
		}
		
		
	}

}
