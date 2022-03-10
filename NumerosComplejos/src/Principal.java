
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Complejo num1,num2,num3;
		
		num1=new Complejo(0,0);
		num2=new Complejo(3,5);
		num3=new Complejo(3,5);
		
		Complejo suma=num2.suma(num3);
		System.out.println(suma);
		
	}

}
