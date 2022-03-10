import java.util.Scanner;

public class calculadora {
	
	public static Scanner teclado= new Scanner(System.in);

	public static void main(String[] args) {
	
		int num1,num2,resultado=0;
		char operacion,opcion='S';
		boolean error=false;
		
		while (opcion=='S') {
			System.out.println("¿Quieres realizar una operacion? S/N");
			opcion=teclado.nextLine().charAt(0);
			
			if (opcion=='S') {
				System.out.println("Introduzca un numero: ");
				num1=Integer.parseInt(teclado.nextLine());
				
				System.out.println("Introduzca otro numero: ");
				num2=Integer.parseInt(teclado.nextLine());
				
				System.out.println("Introduce la operacion");
				operacion = teclado.nextLine().charAt(0);

				switch (operacion) {
				case '+': {
					resultado=num1+num2;
					break;
				}
				case '-': {
					resultado=num1-num2;
					break;
				}
				case '*': {
					resultado=num1*num2;
					break;
				}
				case '/': {
					if (num2==0) {
						error=true;
					}
					else {
						resultado=num1/num2;
					}
					break;
				}
				default:
					error=true;
				}		
				if (error==true) {
					System.out.println("Error");
				}
				else {
					System.out.println("El resultado es "+resultado);
				}
			}
			else if (opcion=='N') {
				System.out.println("Apagando calculadora");
			}
			else {
				System.out.println("Introduce S o N");
				opcion='S';
			}
			
			
		}
		
		
		
	}


}
