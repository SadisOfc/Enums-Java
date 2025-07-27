package Enums.middle.example3;


public class Main {
    public static void main(String[]args){
        Transport t1 = Transport.AIRPLANE;
        Transport t2 = Transport.TRAIN;
        Transport t3 = Transport.CAR;
        System.out.println("Avarage speed " + t1.name()+ ": " + t1.getVelocity());
        System.out.println("Avarage speed " + t2.name()+ ": " + t2.getVelocity());
        System.out.println("Avarage speed " + t3.name()+ ": " + t3.getVelocity());
    }
}
