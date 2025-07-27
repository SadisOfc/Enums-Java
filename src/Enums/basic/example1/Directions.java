package Enums.basic.example1;

public class Directions {
    public enum Direction {
        NORTH, EAST, WEST, SOUTH;
    }
    public static void main(String[] args) {
        for (Direction d : Direction.values()) {
            switch (d) {
                case NORTH -> System.out.println("You are going North");
                case SOUTH -> System.out.println("You are going South");
                case EAST -> System.out.println("You are going East");
                case WEST -> System.out.println("You are going West");
            }
        }
    }
}