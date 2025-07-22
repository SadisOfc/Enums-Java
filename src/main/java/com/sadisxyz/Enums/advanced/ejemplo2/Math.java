package main.java.com.sadisxyz.Enums.advanced.ejemplo2;

public enum Math implements Operation{
    SUM(Double::sum), SUBTRACT((a, b) -> a-b), MULTIPLY((a, b) -> a*b), DIVIDE((a, b) -> a/b);
    private final Operation operation;
    Math(Operation operation){
        this.operation = operation;
    }

    @Override
    public double apply(double a, double b) {
        return operation.apply(a,b);
    }
}
