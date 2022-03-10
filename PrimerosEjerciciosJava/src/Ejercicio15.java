public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ejercicio15());
	}

	public static String ejercicio15() {
		String resultado="";
		int i=1;
		do {
			if (i%5==0) {
				resultado=resultado+i+"\n";
			}
			i++;
		} while (i<=100);
		return resultado;
			
		}
		
		
		
}