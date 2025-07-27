package Enums.basic.ejemplo5;

public class Main {
    public static void main(String[]args){
        Switch light = new Switch();
        light.printState();
        light.toggle();
        light.printState();
    }
}
