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
		Scanner comprasUsuario = new Scanner(System.in);
		List<Object> listaCompra = new ArrayList<>();

		LimiteDeTargeta limiteDeTargeta = new LimiteDeTargeta();
		System.out.print("Digita el limite de tu targeta: ");
		limiteDeTargeta.setLimiteTargeta(teclado2.nextDouble());
		System.out.println("");


		MenuSeleccion menuSeleccion = new MenuSeleccion();
		menuSeleccion.getMenu();
		System.out.print("Selecciona una obcion: ");
		menuSeleccion.setObcion(teclado.nextInt());

		RealizarCompras realizarCompras = new RealizarCompras();

		boolean continuar = true;
		while (continuar) {

			if (menuSeleccion.getObcion() == 1) {
				while (true) {
					System.out.print("Digita lo que compraste: ");
					String compras = comprasUsuario.nextLine();
					System.out.println("");
					System.out.print("digita el valor de la compra: ");
					int valorCompra = comprasUsuario.nextInt();


					listaCompra.add(compras);
					listaCompra.add(valorCompra);

					System.out.println(listaCompra);

					while (true) {
						System.out.println("""
								Quieres agregar algo mas al carrito?, digita.
								1) SI.
								2) NO.
								Rpuesta: 
								""");
						int obcion = teclado.nextInt();
						if (obcion == 1) {
							System.out.println("ok sigamos");

							break;

						} else if (obcion == 2) {
							System.out.println("Listo tus compras quedaran guardas");
							continuar = false;
							break;

						} else {
							System.out.println("Obcion invalida");
						}
					}

				}
			} else if (menuSeleccion.getObcion() == 2) {

			}
		}
	}
	}