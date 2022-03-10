import java.util.Scanner;

public class Ejercicio21 {

	public static Scanner teclado= new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(ejercicio21());

	}

	public static int ejercicio21() {
	int resultado=0,num=-1;
	
	while (num<0) {
		num=leerEntero("Introduce un numero");
		if (num<0) {
			System.out.println("Tienes que introducir un numero positivo");
		}
		for (int i = 0; i < 100; i++) {
			resultado=resultado+num;
			num=num+1;
		}
	}
	return resultado;
	}
	public static int leerEntero(String texto) {
		System.out.println(texto);
		return Integer.parseInt(teclado.nextLine());
	}
}
