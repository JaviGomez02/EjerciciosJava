import java.util.Scanner;

public class pruebas {

	public static Scanner teclado= new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-ge
		
		
		
		String cadena=leerCadena("escribe");
		int dia=Integer.parseInt(cadena.substring(0, 2));
		int mes=Integer.parseInt(cadena.substring(3, 5));
		int anno=Integer.parseInt(cadena.substring(6, 10));
		System.out.println(dia);
		System.out.println(mes);
		System.out.println(anno);
	}
	public static String leerCadena(String texto) {
		System.out.println(texto);
		return teclado.nextLine();
	}
}
