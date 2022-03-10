
public class Fecha {

	//Atributos
	private int dia;
	private int mes;
	private int anno;
	
	
	//Constructores
	public Fecha(int dia, int mes, int anno) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.anno = anno;
	}
	public Fecha(String cadena) {
		this.dia=Integer.parseInt(cadena.substring(0, 2));
		this.mes=Integer.parseInt(cadena.substring(3, 5));
		this.anno=Integer.parseInt(cadena.substring(6, 10));
	}
	
	
	
	
}
