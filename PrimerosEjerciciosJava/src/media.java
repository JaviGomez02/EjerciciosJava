import java.util.Scanner;

public class media {

	public static Scanner teclado= new Scanner(System.in);
	
	public static void main(String[] args) {
		//10 numeros y calcular la media de los 10 numeros
		int num,i;
		float total=0;
		
		for (i=1;i<=10;i++) {
			System.out.println("Introduce un numero");
			num=Integer.parseInt(teclado.nextLine());
			total=total+num;
		}
		
		System.out.println(total/10);

	}

}
