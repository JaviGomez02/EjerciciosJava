
public class Ejercicio12 {

	public static void main(String[] args) {

		System.out.println(ejercicio12());
	}

	public static String ejercicio12() {
		String resultado="";
		int i=100;
		do {
			resultado=resultado+i+"\n";
			i=i-1;
		} while (i>=1);
		
		
		return resultado;
	}
}
