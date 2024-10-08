package Modelos;

import java.util.Scanner;

public class RealizarCompras {

    private String ordenDeCompra;

    Scanner teclado = new Scanner(System.in);

    public String getOrdenDeCompra() {
        return ordenDeCompra;
    }

    public void setOrdenDeCompra(String ordenDeCompra) {
        this.ordenDeCompra = ordenDeCompra;
    }
}
