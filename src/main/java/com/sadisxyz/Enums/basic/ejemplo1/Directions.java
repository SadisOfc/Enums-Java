package main.java.com.sadisxyz.Enums.basic.ejemplo1;

public class Directions {
    public enum Direction{
        NORTH, EAST, WEST, SOUTH;
    }
    public static void main(String[] args){
        for(Direction d : Direction.values()){
            switch (d){
                case NORTH ->System.out.println("Vas hacia el Norte");
                case SOUTH -> System.out.println("Vas hacia el Sur");
                case EAST -> System.out.println("Vas hacia el Este");
                case WEST -> System.out.println("Vas hacia el Oeste");
            }
        }
    }
}
