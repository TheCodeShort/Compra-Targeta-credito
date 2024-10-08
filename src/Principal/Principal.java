package Principal;

import Menu.MenuSeleccion;
import Modelos.LimiteDeTargeta;
import Modelos.RealizarCompras;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);

		LimiteDeTargeta limiteDeTargeta = new LimiteDeTargeta();
		System.out.print("Digita el limite de tu targeta: " );
		limiteDeTargeta.setLimiteTargeta(teclado2.nextDouble());
		System.out.println("");


		MenuSeleccion menuSeleccion = new MenuSeleccion();
		menuSeleccion.getMenu();
		System.out.print("Selecciona una obcion: ");
		menuSeleccion.setObcion(teclado.nextInt());



		while (true) {

			if (menuSeleccion.getObcion() == 1) {

				Scanner listaCompra = new Scanner(System.in);
				String compras = listaCompra.nextLine();

				List listaCompra = new ArrayList<>();
				listaCompra.add(compras);

				RealizarCompras realizarCompras = new RealizarCompras();
				realizarCompras.setOrdenDeCompra();


			} else if (menuSeleccion.getObcion() == 2) {

			}
		}

	}
}
