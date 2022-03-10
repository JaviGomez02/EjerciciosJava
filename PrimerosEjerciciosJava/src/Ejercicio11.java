
public class Ejercicio11 {

	public static void main(String[] args) {
		
		System.out.println(ejercicio11());
	}

	public static String ejercicio11() {
		String resultado="";
		int i=100;
		while (i>=1) {
			resultado=resultado+i+"\n";
			i=i-1;
		}
		
		return resultado;
	}
	
}
