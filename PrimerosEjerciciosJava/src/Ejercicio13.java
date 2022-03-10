public class Ejercicio13 {

	public static void main(String[] args) {

		System.out.println(ejercicio13());

	}

	public static String ejercicio13() {
		String resultado="";
		for (int i = 0; i <= 100; i++) {
			if (i%5==0) {
				resultado=resultado+i+"\n";
			}
			
		}
		
		return resultado;
	}
}