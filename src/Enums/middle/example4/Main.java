package Enums.middle.example4;

public class Main {
    public static void main(String[]args){
        Shape shape = Shape.CIRCLE;
        for(Shape s : Shape.values()){
            s.draw();
        }
    }
}
