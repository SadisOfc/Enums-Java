package Enums.advanced.example1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(Size.MEDIUM, Menu.CROQUETAS, 2);
        Product product2 = new Product(Size.BIG, Menu.PAELLA, 1);
        Product product3 = new Product(Size.SMALL, Menu.NATILLA, 3);

        List<Product> listaProductos = new ArrayList<>();
        listaProductos.add(product1);
        listaProductos.add(product2);
        listaProductos.add(product3);

        Order order = new Order(listaProductos);

        System.out.println("\nRESUMEN DEL PEDIDO");
        order.resume();

        System.out.printf("TOTAL A PAGAR: $%.0f%n", order.getTotal());

        System.out.println("\nEliminando producto con ID: " + product2.getId());
        order.eliminar(product2.getId());

        System.out.println("\nPEDIDO ACTUALIZADO");
        order.resume();
        System.out.printf("NUEVO TOTAL: $%.0f%n", order.getTotal());

        System.out.println("\nDETALLE COMPLETO");
        order.getLista().forEach(System.out::println);
    }
}