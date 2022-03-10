import java.util.Objects;

public class Cuenta {
	//Atributos
	private double saldo;
	private int nIngresos=0;
	private int nReintegros=0;
	private int ncc;
	
	//Constructores
	Cuenta(int ncc,double saldo){
		this.ncc=ncc;
		this.saldo=saldo;
	}
	
	//Métodos
	public boolean ingresar(double cont) {
		boolean resultado;
		if (cont>=0) {
			resultado=true;
			saldo=saldo+cont;
			nIngresos=nIngresos+1;
		}
		else {
			resultado=false;
		}
		return resultado;
	}
	
	public boolean reintegro(double cont) {
		boolean resultado;
		if (saldo>=cont && cont>0) {
			resultado=true;
			saldo=saldo-cont;
			nReintegros=nReintegros+1;
		}
		else {
			resultado=false;
		}
		return resultado;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getnIngresos() {
		return nIngresos;
	}

	public int getnReintegros() {
		return nReintegros;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ncc);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cuenta other = (Cuenta) obj;
		return ncc == other.ncc;
	}
	
	
	
	
	
	
	
	
}
