
public class Persona {

	//Atributos
	private String nombre;
	private int edad;
	private String DNI;
	private Password password;
	private char sexo;
	private int peso;
	private double altura;
	
	
	//Constructores
	public Persona() throws PersonaException {
		super();
		this.nombre = "";
		this.edad = 0;
		this.DNI = generaDNI();
		this.password = new Password();
		this.setSexo(sexo);
		this.peso = 0;
		this.altura = 0;
	}
	
	public Persona(String nombre, int edad, char sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.DNI=generaDNI();
		this.peso = 0;
		this.altura = 0;
		this.password = new Password();
	}
	

	public Persona(String nombre, int edad, String DNI, char sexo, int peso, double altura) throws PersonaException {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = DNI;
		this.setSexo(sexo);
		this.peso = peso;
		this.altura = altura;
		this.password = new Password();
	}

	//Metodos
	
	
	
	public String generaDNI() {
		String cadena="";
		int numero;
		for (int i = 0; i < 8; i++) {
			numero=(int) (Math.random()*10);
			cadena=cadena+numero;
		}
		
		return cadena;
	}
	
	public int calcularIMC() {
		int resultado;
		double calculo = peso/(altura*altura);
		if (calculo<20) {
			resultado=-1;
		}
		else if (calculo>=20 && calculo<=25) {
			resultado=0;
		}
		else {
			resultado=1;
		}
		return resultado;
	}
	
	public boolean esMayorDeEdad() {
		boolean resultado=false;
		if (edad>=18) {
			resultado=true;
		}
		return resultado;
	}
	public boolean comprobarSexo(){
		boolean resultado=false;
		if (sexo=='H' || sexo=='M') {
			resultado=true;
		}
		return resultado;
	}

	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) throws PersonaException{
		if (edad<0 || edad>120) {
			throw new PersonaException("Edad incorrecta");
		}
		this.edad = edad;
	}

	public String getPassword() {
		return password.getContrasena();
	}

	public void setPassword(Password password) {
		this.password = password;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) throws PersonaException{
		if (sexo!='M' && sexo!='H') {
			throw new PersonaException("00001: Sexo incorrecto");
		}
		this.sexo = sexo;
	}

	public int getPeso(){
	
		return peso;
	}

	public void setPeso(int peso)  throws PersonaException{
		if (peso<0) {
			throw new PersonaException("Peso incorrecto");
		}
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) throws PersonaException {
		if (altura<0) {
			throw new PersonaException("Altura incorrecta");
		}
		this.altura = altura;
	}

	public String getDNI() {
		return DNI;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", password=" + password + ", sexo="
				+ sexo + ", peso=" + peso + ", altura=" + altura + "]";
	}
	
	
}
