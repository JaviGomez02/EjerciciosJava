import java.util.Scanner;

public class Ejercicio22 {

	public static Scanner teclado= new Scanner(System.in);
	public static void main(String[] args) {
		

		int resultado=0, num=0;
		while (num>=0) {
			num=leerEntero("Introduce un numero:");
			if (num>=0) {
				resultado=num*num;
				System.out.println("El resultado es: "+resultado);
			}
			else {
				System.out.println("Apagando programa");
			}
		}
		
	}
	
	public static int leerEntero(String texto) {
		System.out.println(texto);
		return Integer.parseInt(teclado.nextLine());
	}
	
	
}
