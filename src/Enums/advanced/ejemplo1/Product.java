package Enums.advanced.ejemplo1;

public class Product {
    private static int contador=1;
    private final int id;
    private Menu menu;
    private Size tamaño;
    private int cantidad;
    private double precio;

    public Product(Size tamaño, Menu menu, Integer cantidad) {
        this.tamaño = tamaño;
        this.menu = menu;
        this.cantidad = cantidad;
        precio = cantidad * menu.getPrecio() * tamaño.getMultiplicador();
        this.id=contador++;
    }

    public Menu getMenu() {
        return menu;
    }
    public Size getTamaño() {
        return tamaño;
    }
    public Integer getCantidad(){
        return cantidad;
    }
    public Double getPrecio() {
        return precio;
    }
    public Integer getId(){
        return id;
    }

    @Override
    public String toString(){
        return "INFORMACIÓN \n" +
                "ID: " + id + "\n"+
                "Nombre: " + menu.getDescripcion()+"\n"+
                "Plato: " + menu.getDish()+"\n"+
                "Tamaño: " + tamaño.name()+"\n"+
                "Cantidad: " + cantidad+"\n"+
                "Precio: " + precio;
    }
}
