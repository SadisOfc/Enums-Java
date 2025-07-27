package Enums.advanced.ejemplo1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product producto1 = new Product(Size.MEDIANO, Menu.CROQUETAS, 2);
        Product producto2 = new Product(Size.GRANDE, Menu.PAELLA, 1);
        Product producto3 = new Product(Size.PEQUEÑO, Menu.NATILLA, 3);

        List<Product> listaProductos = new ArrayList<>();
        listaProductos.add(producto1);
        listaProductos.add(producto2);
        listaProductos.add(producto3);

        Order pedido = new Order(listaProductos);

        System.out.println("\nRESUMEN DEL PEDIDO");
        pedido.resumen();

        System.out.printf("TOTAL A PAGAR: $%.0f%n", pedido.getTotal());

        System.out.println("\nEliminando producto con ID: " + producto2.getId());
        pedido.eliminar(producto2.getId());

        System.out.println("\nPEDIDO ACTUALIZADO");
        pedido.resumen();
        System.out.printf("NUEVO TOTAL: $%.0f%n", pedido.getTotal());

        System.out.println("\nDETALLE COMPLETO");
        pedido.getLista().forEach(System.out::println);
    }
}