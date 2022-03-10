import java.util.Objects;

public class Producto {
	
	//Atributos
	private int codigo=0;
	private static int codigoSiguiente=1;
	private String descripcion;
	private double precio;
	private static final int IVA=20;
	
	
	//Constructor
	public Producto(String descripcion, double precio) throws ProductoExcepcion {
		super();
		this.codigo=codigoSiguiente++;
		this.descripcion = descripcion;
		this.setPrecio(precio);
	}

	//Métodos
	public int getCodigo() {
		return codigo;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) throws ProductoExcepcion {
		if (precio<0) {
			throw new ProductoExcepcion("Precio debe ser mayor que 0");
		}
		else {
			this.precio=precio;
		}
		this.precio = precio;
	}


	public static double getIva() {
		return IVA;
	}
	
	
	public double calcularPrecio() {
		double resultado=precio+(precio*IVA/100);
		return resultado;
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return codigo == other.codigo;
	}
	
	
}
