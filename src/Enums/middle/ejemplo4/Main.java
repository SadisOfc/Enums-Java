package Enums.middle.ejemplo4;

public class Main {
    public static void main(String[]args){
        Shape forma = Shape.CIRCLE;
        for(Shape s : Shape.values()){
            s.draw();
        }
    }
}
