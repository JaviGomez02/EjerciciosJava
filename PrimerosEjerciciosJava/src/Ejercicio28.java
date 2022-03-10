import java.util.Scanner;

public class Ejercicio28 {

	public static Scanner teclado= new Scanner(System.in);

	public static void main(String[] args) {
		int n,fibo1=0,fibo2=1,fiboTotal=0;
		n=leerEntero("Introduce cuantos numeros quieres mostrar");
		
		for (int i = 2; i <= n; i++) {
			fiboTotal=fibo1+fibo2;
			fibo2=fibo1;
			fibo1=fiboTotal;
		}
		System.out.println(fiboTotal);
		
	}

	public static int leerEntero(String texto) {
		System.out.println(texto);
		return Integer.parseInt(teclado.nextLine());
	}
}
