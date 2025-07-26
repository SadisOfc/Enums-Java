package Enums.basic.ejemplo4;

public enum Priority {
    LOW(1),MEDIUM(2),HIGH(3);
    private final Integer num;
    Priority(Integer num){
        this.num = num;
    }
    public Integer getNum(){
        return num;
    }
}
