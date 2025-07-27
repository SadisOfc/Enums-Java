package Enums.advanced.ejemplo1;

public enum Menu {
    ACEITUNAS_ALIÑADAS("Aceitunas aliñadas",Dish.APERITIVO,6000),
    CROQUETAS("Croquetas (porción)",Dish.APERITIVO,10000),
    TORTILLA("Tortilla española (porción)",Dish.APERITIVO,8500),
    CALAMARES("Calamares a la romana (entrada pequeña)",Dish.APERITIVO,14000),
    PAN_AIOLI("Pan con alioli o tomate",Dish.APERITIVO,5000),
    ENSALADA_MIXTA("Ensalada mixta",Dish.PLATO_PRINCIPAL,12000),
    SOPA("Sopa del día",Dish.PLATO_PRINCIPAL,10000),
    GAZPACHO("Gazpacho o salmorejo",Dish.PLATO_PRINCIPAL,14000),
    PASTA("Pasta (espaguetis/lasaña individual)",Dish.PLATO_PRINCIPAL,20000),
    PAELLA("Arroz o paella individual",Dish.PLATO_PRINCIPAL,24000),
    FLAN("Flan de huevo",Dish.POSTRE,8000),
    TARTA_QUESO("Tarta de queso",Dish.POSTRE,12000),
    NATILLA("Natillas",Dish.POSTRE,7000),
    FRUTA_SECA("Fruta fresca",Dish.POSTRE,6000),
    HELADO("Helado",Dish.POSTRE,10000);

    private final String descripcion;
    private final Dish dish;
    private final double precio;

    Menu(String descripcion, Dish dish, double precio) {
        this.descripcion = descripcion;
        this.dish = dish;
        this.precio = precio;
    }

    public String getDescripcion(){
        return descripcion;
    }
    public Dish getDish() {
        return dish;
    }
    public double getPrecio() {
        return precio;
    }
}
