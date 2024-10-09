package Modelos;

import java.util.Scanner;

public class LimiteDeTargeta extends ContolSaldo {

	private double limiteTargeta;


	public double getLimiteTargeta() {
		return limiteTargeta;
	}

	public void setLimiteTargeta(double limiteTargeta) {
		 this.limiteTargeta = limiteTargeta;
	}

	public void limiteDinero(){

		Scanner teclado2 = new Scanner(System.in);

		System.out.print("Digita el limite de tu targeta: ");
		setLimiteTargeta(teclado2.nextDouble());
		System.out.println("");

	}
}
