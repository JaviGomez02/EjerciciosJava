import java.util.Scanner;

public class Main {

	public static Scanner teclado= new Scanner(System.in);

	public static void main(String[] args) throws ProductoExcepcion {
		// TODO Auto-generated method stub
		
		Producto[] arrayProducto=new Producto[100];
		
		for (int i = 0; i < 5; i++) {
			arrayProducto[i]=new Producto(leerCadena("Introduce una descripción"),leerReal("Introduce un precio"));
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println(arrayProducto[i]);
		}
	}

	
	
	
	public static String leerCadena(String texto) {
		System.out.println(texto);
		return teclado.nextLine();
	}
	public static double leerReal(String texto) {
		System.out.println(texto);
		return Double.parseDouble(teclado.nextLine());
	}
}
