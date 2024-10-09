package Modelos;
import Menu.MenuSeleccion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RealizarCompras extends MenuSeleccion {

    Scanner teclado = new Scanner(System.in);
    Scanner comprasUsuario = new Scanner(System.in);
    List<Object> listaCompra = new ArrayList<>();


    public void comprar() {

        boolean continuar = true;
        while (continuar) {


            getMenu();
            System.out.print("Selecciona una obcion: ");
            setObcion(teclado.nextInt());


            if (getObcion() == 1) {
                boolean continuar2 = true;
                while (continuar2) {

                    System.out.print("Digita lo que compraste: ");
                    String compras = comprasUsuario.nextLine();
                    System.out.print("digita el valor de la compra: ");
                    int valorCompra = comprasUsuario.nextInt();
                    comprasUsuario.nextLine();/*esto me ayuda a consumir el salto de linea que no consume "comprasUsuario.nextInt();"*/


                    listaCompra.add(compras);
                    listaCompra.add(valorCompra);


                    boolean continuar3 = true;
                    while (continuar3) {
                        System.out.print("Quieres agregar algo mas al carrito (1.SI/2.NO): ");
                        int obcion = teclado.nextInt();
                        if (obcion == 1) {
                            System.out.println("ok sigamos");
                            System.out.println();
                            break;

                        } else if (obcion == 2) {
                            System.out.println("Listo tus compras quedaran guardas");
                            System.out.println();
                            continuar2 = false;
                            continuar3 = false;


                        } else {
                            System.out.println("Obcion invalida");
                        }
                    }

                }
            } else if (getObcion() == 2) {

                listaCompra.forEach(item -> {
                    System.out.println(item);
                });
                System.out.println();

            } else if (getObcion() == 3) {
                System.out.println("Aca te dejo un resumen de lo que compraste");

                listaCompra.forEach(item -> {
                    System.out.println(item);
                });

                continuar = false;


            } else {
                System.out.println("Obcion invalida");
            }

        }
    }
}

