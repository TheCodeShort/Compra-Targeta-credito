package Modelos;

import java.util.ArrayList;
import java.util.List;

public class TargetaDeCredito {

	private double limite;
	private double saldo;
	private List<OrdenCompra> listaDeCompra;

	public TargetaDeCredito(double limite){
		this.limite = limite;
		this.saldo = limite;
		this.listaDeCompra = new ArrayList<>();
	}

	public boolean lanzarCompra (OrdenCompra compra){
		if (this.saldo >= compra.getValor()){
			this.saldo -= compra.getValor();
			this.listaDeCompra.add(compra);
			return true;/*si el dodigo se cumple el true hacer que el codigo termine hay */
		}
		return false; /*esto cancela en caso del que el if no se cumpla*/
	}

	public double getSaldo() {
		return saldo;
	}

	public double getLimite() {
		return limite;
	}

	public List<OrdenCompra> getListaDeCompra() {
		return listaDeCompra;
	}
}
