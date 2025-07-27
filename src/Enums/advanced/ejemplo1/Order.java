package Enums.advanced.ejemplo1;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> lista;
    private Integer id = 1;

    public Order(List<Product> lista) {
        this.lista = new ArrayList<>(lista);
    }

    public List<Product> getLista() {
        return lista;
    }
    public Integer getId() {
        return id;
    }

    public void agregar(Product product){
        lista.add(product);
    }
    public void eliminar(Integer id){
        lista.removeIf(p -> p.getId().equals(id));
    }
    public void resumen(){
        System.out.println("Resumen Pedido");
        lista.forEach(a -> System.out.println(a.getMenu() + " - " + a.getPrecio()));
    }
    public double getTotal(){
        return lista.stream().mapToDouble(Product::getPrecio).sum();
    }
}
