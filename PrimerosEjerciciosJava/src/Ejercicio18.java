
public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ejercicio18());

	}

	public static String ejercicio18() {
		String resultado="";
		int i=320;
		do {
			resultado=resultado+i+"\n";
			i=i-20;
		} while (i>=160);
		
		return resultado;
	}
}
