package Enums.advanced.example1;

public enum Dish {
    APPETIZER("Appetizer"),MAIN_COURSE("Main course"), DESSERT("Dessert");
    private final String title;
    Dish(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
}
