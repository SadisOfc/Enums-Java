package Enums.advanced.example1;

public class Product {
    private static int contador=1;
    private final int id;
    private Menu menu;
    private Size size;
    private int quantity;
    private double price;

    public Product(Size size, Menu menu, Integer quantity) {
        this.size = size;
        this.menu = menu;
        this.quantity = quantity;
        price = quantity * menu.getPrice() * size.getMultiplier();
        this.id=contador++;
    }

    public Menu getMenu() {
        return menu;
    }
    public Size getSize() {
        return size;
    }
    public Integer getQuantity(){
        return quantity;
    }
    public Double getPrice() {
        return price;
    }
    public Integer getId(){
        return id;
    }

    @Override
    public String toString(){
        return "INFORMACIÓN \n" +
                "ID: " + id + "\n"+
                "Nombre: " + menu.getDescription()+"\n"+
                "Plato: " + menu.getDish()+"\n"+
                "Tamaño: " + size.name()+"\n"+
                "Cantidad: " + quantity+"\n"+
                "Precio: " + price;
    }
}
