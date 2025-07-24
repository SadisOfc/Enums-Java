package main.java.com.sadisxyz.Enums.middle.ejemplo4;

public enum Shape implements Drawable{
    CIRCLE(() -> System.out.println("Se ha dibujado un Círculo")),
    SQUARE(() -> System.out.println("Se ha dibujado un Cuadrado")),
    TRIANGLE(() -> System.out.println("Se ha dibujado un Triángulo"));
    private final Drawable drawable;
    Shape(Drawable drawable){
        this.drawable = drawable;
    }

    @Override
    public void draw(){
        drawable.draw();
    }
}
