public class Ejercicio14 {

	public static void main(String[] args) {
		
		System.out.println(ejercicio14());
		

	}
	public static String ejercicio14() {
		String resultado="";
		int i=1;
		while (i<=100) {
			if (i%5==0) {
				resultado=resultado+i+"\n";
			}
			i++;
		}
		
		
		return resultado;
	}
}