package Enums.advanced.example1;

public enum Size {
    SMALL(1.0),MEDIUM(1.20),BIG(1.30);
    private final double multiplier;
    Size(double multiplier){
        this.multiplier = multiplier;
    }
    public double getMultiplier(){
        return multiplier;
    }
}
