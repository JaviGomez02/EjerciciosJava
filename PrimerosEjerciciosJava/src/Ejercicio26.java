import java.util.Scanner;

public class Ejercicio26 {

	public static Scanner teclado= new Scanner(System.in);

	public static void main(String[] args) {
		int numero1,numero2;
		String entrada1,entrada2="";
		
		do {
			System.out.println("Introduce un número o introduce 'fin' para terminar");
			entrada1=teclado.nextLine();
			
			if (todosNumeros(entrada1)) {
				numero1=Integer.parseInt(entrada1);
				System.out.println("Introduce un número");
				entrada2=teclado.nextLine();
				if (todosNumeros(entrada2)) {
					numero2=Integer.parseInt(entrada2);
					System.out.println(numero1+numero2);
				}
			}
			
		} while (!entrada1.equals("fin") && !entrada2.equals("fin"));
		
		
		
	}

	public static boolean todosNumeros(String cadena) {
		boolean resultado=true;
		for (int i = 0; i < cadena.length() && resultado==true; i++) 
			resultado=Character.isDigit(cadena.charAt(i));
		return resultado;
		
	}
	
	
	
	
}
