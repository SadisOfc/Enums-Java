package Enums.middle.example1;

public class Main {
    public static void main(String[]args){
        Planet planetita = Planet.EARTH;
        System.out.println(planetita);
        System.out.printf("Surface Gravity: %f.2",planetita.surfaceGravity());
    }
}
