import java.util.Scanner;

public class Ejercicio20 {
	public static Scanner teclado= new Scanner(System.in);

	
	public static void main(String[] args) {

		System.out.println(ejercicio20());
	}

	public static String ejercicio20() {
		String resultado = null;
		Boolean flag=false;
		int num;
		for (int i = 0; i < 5; i++) {
			num=leerEntero("Introduce un numero");
			if (num%3==0) {
				flag=true;
			}
		}
		if (flag==true) {
			resultado="Hay un multiplo de 3";
		}
		else {
			resultado="No hay ningun multiplo de 3";
		}

		return resultado;
	}
	
	public static int leerEntero(String texto) {
		System.out.println(texto);
		return Integer.parseInt(teclado.nextLine());
	}
}
