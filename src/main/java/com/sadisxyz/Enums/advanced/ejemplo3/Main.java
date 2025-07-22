package main.java.com.sadisxyz.Enums.advanced.ejemplo3;


public class Main {
    public static void main(String[]args){
        Transport t1 = Transport.AIRPLANE;
        Transport t2 = Transport.TRAIN;
        Transport t3 = Transport.CAR;
        System.out.println("Velocidad Promedio " + t1.name()+ ": " + t1.getVelocity());
        System.out.println("Velocidad Promedio " + t2.name()+ ": " + t2.getVelocity());
        System.out.println("Velocidad Promedio " + t3.name()+ ": " + t3.getVelocity());
    }
}
