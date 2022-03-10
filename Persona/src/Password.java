
import java.util.Objects;

public class Password {

	 //Atributos
	private int longitud;
	private String contrasena;
	private static final int LONGITUDDEFECTO=8;
	
	//Constructores
	public Password() {
		super();
		this.longitud = LONGITUDDEFECTO;
		generarPassword();
	}
	public Password(int longitud) {
		super();
		this.longitud = longitud;
		generarPassword();
	}
	
	//Métodos
	public void generarPassword() {
		String resultado="";
		int numero;
		char caracter;
		for (int i = 0; i < longitud; i++) {
			numero=(int) (Math.random()*123);
			while (numero<48) {
				numero=(int) (Math.random()*123);
			}
			caracter=(char) numero;
			resultado=resultado+caracter;				
		}
		this.contrasena=resultado;
	}
	
	public boolean esFuerte() {
		boolean resultado=false;
		int contadorMayuscula=0;
		int contadorMinuscula=0;
		int contadorDigito=0;
		for (int i = 0; i < contrasena.length(); i++) {
			char caracter=contrasena.charAt(i);
			if (Character.isUpperCase(caracter)) {
				contadorMayuscula=contadorMayuscula+1;
			}
			else if (Character.isLowerCase(caracter)) {
				contadorMinuscula=contadorMinuscula+1;
			}
			else if (Character.isDigit(caracter)) {
				contadorDigito=contadorDigito+1;
			}
		}
		if (contadorMayuscula>2 && contadorMinuscula>1 && contadorDigito>5) {
			resultado=true;
		}
		
		return resultado;
	}
	
	public int getLongitud() {
		return longitud;
	}
	public String getContrasena() {
		return contrasena;
	}
	@Override
	public int hashCode() {
		return Objects.hash(contrasena);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Password other = (Password) obj;
		return Objects.equals(contrasena, other.contrasena);
	}
	@Override
	public String toString() {
		return contrasena;
	}
	
}
