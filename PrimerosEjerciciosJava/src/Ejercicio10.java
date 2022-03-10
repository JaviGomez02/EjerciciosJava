
public class Ejercicio10 {

	public static void main(String[] args) {
		

		System.out.println(ejercicio10());
	}
	
	
	public static String ejercicio10() {
		String resultado="";
		
		for (int i = 100; i >= 1; i=i-1) {
			resultado=resultado+i+"\n";
		}
		return resultado;
	}
}
