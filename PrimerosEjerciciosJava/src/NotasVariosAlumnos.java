import java.util.Scanner;

public class NotasVariosAlumnos {

	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		//Programa que solicite al usuario tres notas y muestre la calificacion final.
		//A continuacion debe preguntar si quiere introducir otra nota o no S/N. Si dice que si S se deberá peidr otras tres notas de otro alumno.
		//El programa terminará cuando responda que no (N)
		double notaPractica,notaProblema,notaExamen;
		char opc='S';
		
		while (opc!='N') {
			
			System.out.println("Introduce la calificacion de la parte practica");
			notaPractica=Double.parseDouble(teclado.nextLine());
				
			System.out.println("Introduce la calificacion de la parte de problemas");
			notaProblema=Double.parseDouble(teclado.nextLine());
				
			System.out.println("Introduce la calificacion de la parte teorica");
			notaExamen=Double.parseDouble(teclado.nextLine());
				
			System.out.println("La nota del alumno es: "+ media (notaPractica, notaProblema, notaExamen));
					
			System.out.println("¿Quieres introducir una nota? (S/N)");
			opc=teclado.nextLine().charAt(0);
			
		}
		

	}


	public static double media(double notaPractica, double notaProblema, double notaExamen) {
		double resultado = 0.1*notaPractica+0.5*notaExamen+0.4*notaProblema;
		return resultado;
	}
	
	
}
