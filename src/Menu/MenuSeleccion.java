package Menu;

import java.util.Scanner;


public class MenuSeleccion {

	private String menu = """
			1) Ingresa el liminte de la targeta.
			2) Realizar compra.
			3) Mostrar historial de compra.
			""";

	private int obcion;

	public String getMenu() {
		System.out.println(menu);
		return menu;
	}

	public int getObcion() {

		return obcion;
	}

	public void setObcion(int obcion) {
		this.obcion = obcion;

	}
}

