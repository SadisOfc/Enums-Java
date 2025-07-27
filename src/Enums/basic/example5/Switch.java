package Enums.basic.example5;

public class Switch {
    private Status switchStatus;
    public Switch(){
        this.switchStatus = Status.OFF;
    }
    public void toggle(){
        switchStatus = (switchStatus == Status.ON) ? Status.OFF : Status.ON;
    }
    public Status getState(){
        return switchStatus;
    }
    public void printState(){
        System.out.println("State: " + switchStatus);
    }
}
