package Enums.middle.ejemplo1;

public class Main {
    public static void main(String[]args){
        Planet planetita = Planet.EARTH;
        System.out.println(planetita);
        System.out.printf("Gravedad superficial: %f.2",planetita.surfaceGravity());
    }
}
