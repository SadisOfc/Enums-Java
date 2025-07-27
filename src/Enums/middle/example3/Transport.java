package Enums.middle.example3;

public enum Transport implements Promedy{
    CAR(() -> 100),TRAIN(() -> 250),AIRPLANE(() -> 900);
    private final Promedy promedy;
    Transport(Promedy promedy){
        this.promedy = promedy;
    }

    @Override
    public double getVelocity(){
        return promedy.getVelocity();
    }
}
