import java.util.Scanner;
public class CaracterTipo {
	


	public static Scanner teclado= new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		System.out.println(generarPassword());
		
//		int caracter;
//		System.out.println("Introduce un caracter cualquiera");
//		caracter=teclado.nextLine().charAt(0);
//		
//		
//		if (caracter>=65 && caracter<=90) {
//			System.out.println("El caracter es mayuscula");
//		}
//		else if (caracter>=97 && caracter<=122) {
//			System.out.println("El caracter es minuscula");
//		}
//		else if (caracter>=97 && caracter<=122) {
//			System.out.println("El caracter es minuscula");
//		}
//		else if (caracter==44 || caracter==46) {
//			System.out.println("El caracter es un signo de puntuacion");
//		}
//		else if (caracter==32) {
//			System.out.println("El caracter es un espacio en blanco");
//		}
//		else if (caracter==123 || caracter==125 || caracter==40 || caracter==41) {
//			System.out.println("El caracter es un parentesis o llave");
//		}
//		else {
//			System.out.println("El caracter es de otro tipo");
//		}
	}
	public static String generarPassword() {
		String resultado="";
		char caracter;
		for (int i = 0; i < 10; i++) {
			caracter=(char) Math.random();
			resultado=resultado+caracter;
		}
		
	
		return resultado;
	}

}
