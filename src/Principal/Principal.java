package Principal;

import Menu.MenuSeleccion;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		MenuSeleccion menuSeleccion = new MenuSeleccion();
		menuSeleccion.getMenu();

		menuSeleccion.setObcion(teclado.nextInt());


		while (true) {

			if (menuSeleccion.getObcion() == 1) {
				System.out.print("Escribe el limite de tu targeta: ");
				double limite = teclado.nextDouble();

			} else if (menuSeleccion.getObcion() == 2) {

			}
		}


	}
}
