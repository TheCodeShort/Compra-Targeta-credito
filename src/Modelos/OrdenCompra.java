package Modelos;



public class OrdenCompra implements Comparable <OrdenCompra>{ /*aca una cmpra se ordena con otra compra*/

	private double valor;
	private String descripcion;

	public OrdenCompra(String descripcion, double valor) {
		this.descripcion = descripcion;
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public String getDescripcion() {
		return descripcion;
	}

	@Override
	public String toString() {
		return "OrdenCompra:" + "valor=" + valor +
				", descripcion='" + descripcion;
	}

	@Override
	public int compareTo(OrdenCompra otraCompra) {
		return Double.valueOf(this.valor).compareTo(Double.valueOf(otraCompra.getValor()));
	}
}
