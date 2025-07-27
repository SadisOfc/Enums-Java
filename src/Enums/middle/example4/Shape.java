package Enums.middle.example4;

public enum Shape implements Drawable{
    CIRCLE(() -> System.out.println("A circle has been drawn ")),
    SQUARE(() -> System.out.println("A square has been drawn")),
    TRIANGLE(() -> System.out.println("A triangle has been drawn"));
    private final Drawable drawable;
    Shape(Drawable drawable){
        this.drawable = drawable;
    }

    @Override
    public void draw(){
        drawable.draw();
    }
}
