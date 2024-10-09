package Principal;

import Modelos.LimiteDeTargeta;
import Modelos.RealizarCompras;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {


		LimiteDeTargeta limiteDeTargeta = new LimiteDeTargeta();
		limiteDeTargeta.limiteDinero();


		RealizarCompras realizarCompras = new RealizarCompras();
		realizarCompras.comprar();

	}
}