
public class ejercicio9 {

	public static void main(String[] args) {
		
		System.out.println(ejer9());
	}

	public static String ejer9() {
		String resultado="";
		int i=0;
		
		do {
			i++;
			resultado=resultado+i+"\n";
		} while (i<100);
		
		return resultado;
	}
}
