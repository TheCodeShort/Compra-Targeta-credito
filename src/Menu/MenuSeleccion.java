package Menu;


import Modelos.LimiteDeTargeta;

public class MenuSeleccion extends LimiteDeTargeta {

	private String menu = """
			1) Realizar compra.
			2) Mostrar historial de compra.
			3) Salir.
			""";

	private int obcion;

	public void getMenu() {
		System.out.println(menu);
	}

	public int getObcion() {
		return obcion;
	}

	public void setObcion(int obcion) {
		this.obcion = obcion;
	}
}

