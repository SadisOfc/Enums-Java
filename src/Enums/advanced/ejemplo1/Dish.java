package Enums.advanced.ejemplo1;

public enum Dish {
    APERITIVO("Aperitivo"),PLATO_PRINCIPAL("Plato Principal"),POSTRE("Postre");
    private final String titulo;
    Dish(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return titulo;
    }
}
