package Enums.advanced.example1;

public enum Menu {
    ACEITUNAS_ALIÑADAS("Aceitunas aliñadas",Dish.APPETIZER,6000),
    CROQUETAS("Croquetas (porción)",Dish.APPETIZER,10000),
    TORTILLA("Tortilla española (porción)",Dish.APPETIZER,8500),
    CALAMARES("Calamares a la romana (entrada pequeña)",Dish.APPETIZER,14000),
    PAN_AIOLI("Pan con alioli o tomate",Dish.APPETIZER,5000),
    ENSALADA_MIXTA("Ensalada mixta",Dish.MAIN_COURSE,12000),
    SOPA("Sopa del día",Dish.MAIN_COURSE,10000),
    GAZPACHO("Gazpacho o salmorejo",Dish.MAIN_COURSE,14000),
    PASTA("Pasta (espaguetis/lasaña individual)",Dish.MAIN_COURSE,20000),
    PAELLA("Arroz o paella individual",Dish.MAIN_COURSE,24000),
    FLAN("Flan de huevo",Dish.DESSERT,8000),
    TARTA_QUESO("Tarta de queso",Dish.DESSERT,12000),
    NATILLA("Natillas",Dish.DESSERT,7000),
    FRUTA_SECA("Fruta fresca",Dish.DESSERT,6000),
    HELADO("Helado",Dish.DESSERT,10000);

    private final String description;
    private final Dish dish;
    private final double price;

    Menu(String description, Dish dish, double price) {
        this.description = description;
        this.dish = dish;
        this.price = price;
    }

    public String getDescription(){
        return description;
    }
    public Dish getDish() {
        return dish;
    }
    public double getPrice() {
        return price;
    }
}
