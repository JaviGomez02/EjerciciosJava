import java.util.Scanner;

public class Ejercicio42 {

	public static Scanner teclado= new Scanner(System.in);

	public static void main(String[] args) {
		//Realizar un método que dada una cadena de entrada, comprueba si es una contraseña FUERTE o DÉBIL.
		//Se considera que una contraseña es fuerte si contiene 8 o más caracteres,
		//y entre ellos al menos hay una mayúscula, una minúscula, un signo de puntuación y un dígito.
		
		String cadena;
		cadena=leerCadena("Introduce una contraseña");
		if (mayorDe8(cadena)==true && mayuscula(cadena)==true && minuscula(cadena)==true && signoPuntuacion(cadena)==true && digito(cadena)==true) {
			System.out.println("Contraseña fuerte");
		}
		else {
			System.out.println("Contraseña debil");
		}

	}
	public static String leerCadena(String texto) {
		System.out.println(texto);
		return teclado.nextLine();
	}
	
	public static Boolean mayorDe8(String cadena) {
		boolean flag=false;
		if (cadena.length()>=8) {
			flag=true;
		}
		return flag;
	}
	public static Boolean mayuscula(String cadena) {
		boolean flag=false;
		for (int i = 0; i < cadena.length(); i++) {
			if (Character.isUpperCase(cadena.charAt(i))) {
				flag=true;
			}
		}
		
		return flag;
	}
	public static Boolean minuscula(String cadena) {
		boolean flag=false;
		for (int i = 0; i < cadena.length(); i++) {
			if (Character.isLowerCase(cadena.charAt(i))) {
				flag=true;
			}
		}
		
		return flag;
	}
	public static Boolean signoPuntuacion(String cadena) {
		boolean flag=false;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i)=='.' || cadena.charAt(i)==',' ) {
				flag=true;
			}
		}
		
		return flag;
	}
	public static Boolean digito(String cadena) {
		boolean flag=false;
		for (int i = 0; i < cadena.length(); i++) {
			if (Character.isDigit(cadena.charAt(i))) {
				flag=true;
			}
		}
		
		return flag;
	}
}
