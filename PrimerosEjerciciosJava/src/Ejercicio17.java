
public class Ejercicio17 {

	public static void main(String[] args) {
		
		System.out.println(ejercicio17());

	}
	public static String ejercicio17() {
		String resultado="";
		int i=320;
		
		while (i>=160) {
			resultado=resultado+i+"\n";
			i=i-20;
		}
		
		return resultado;
	}
}
