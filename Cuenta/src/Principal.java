import java.util.Scanner;

public class Principal {
	
	public static Scanner teclado= new Scanner(System.in);


	public static void main(String[] args) {
		int i=1,opcion;
		Cuenta c1;
		
		c1=new Cuenta(1223,10);
		
		while (i!=0) {
			opcion=leerEntero("1. Hacer reintegro; 2.Hacer ingreso; 3. Consultar saldo, num de ingresos y num de reintegros; 4. Salir");
			switch (opcion) {
			case 1: {
				if (c1.reintegro(leerReal("Introduce una cantidad para realizar reintegro"))==true) {
					System.out.println("Reintegro realizado");
				}
				else {
					System.out.println("Reintegro erroneo");
				}
				break;
			}
			case 2: {
				if (c1.ingresar(leerReal("Introduce una cantidad para ingresar"))==true) {
					System.out.println("Ingreso realizado");
				}
				else {
					System.out.println("Ingreso erroneo");
				}
				break;
			}
			case 3: {
				System.out.println("El saldo es "+c1.getSaldo()+"  Ingresos realizados: "+c1.getnIngresos()+ "  Reintegros realizados: "+c1.getnReintegros());
				break;
			}
			case 4: {
				i=0;
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcion);
			}
			
		}
		
		
	}
	public static int leerEntero(String texto) {
		System.out.println(texto);
		return Integer.parseInt(teclado.nextLine());
	}
	public static double leerReal(String texto) {
		System.out.println(texto);
		return Double.parseDouble(teclado.nextLine());
	}
}
