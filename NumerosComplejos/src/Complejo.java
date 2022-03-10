import java.util.Objects;

public class Complejo {

	private double parteReal;
	private double parteImaginaria;
	
	//Constructor
	
	public Complejo(double parteReal, double parteImaginaria) {
		super();
		this.parteReal = parteReal;
		this.parteImaginaria = parteImaginaria;
	}

	
	@Override
	public String toString() {
		String resultado;
		if (parteImaginaria>0) {
			resultado="(" + parteReal + "+" + parteImaginaria + "i)";
		}
		else if (parteImaginaria==0) {
			resultado="(" + parteReal + ")";

		}
		else {
			resultado="(" + parteReal + "" + parteImaginaria + "i)";

		}
		return resultado;
	}


	@Override
	public int hashCode() {
		return Objects.hash(parteImaginaria, parteReal);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Complejo other = (Complejo) obj;
		return Double.doubleToLongBits(parteImaginaria) == Double.doubleToLongBits(other.parteImaginaria)
				&& Double.doubleToLongBits(parteReal) == Double.doubleToLongBits(other.parteReal);
	}
	
	public Complejo suma(Complejo sumando) {
		Complejo resultado = new Complejo(0,0);
		
		resultado.parteReal=this.parteReal + sumando.parteReal;
		resultado.parteImaginaria=this.parteImaginaria + sumando.parteImaginaria;
		return resultado;
	}
	public Complejo resta(Complejo sumando) {
		Complejo resultado = new Complejo(0,0);
		
		resultado.parteReal=this.parteReal - sumando.parteReal;
		resultado.parteImaginaria=this.parteImaginaria - sumando.parteImaginaria;
		return resultado;
	}


	public double getParteReal() {
		return parteReal;
	}


	public void setParteReal(double parteReal) {
		this.parteReal = parteReal;
	}


	public double getParteImaginaria() {
		return parteImaginaria;
	}


	public void setParteImaginaria(double parteImaginaria) {
		this.parteImaginaria = parteImaginaria;
	}
	
	
	
	
	
	
	
	
}



