package Enums.middle.example2;

public enum Math implements Operation{
    SUM(Double::sum), SUBTRACT((a, b) -> a-b), MULTIPLY((a, b) -> a*b), DIVIDE((a, b) -> a/b);
    private final Operation operation;
    Math(Operation operation){
        this.operation = operation;
    }

    @Override
    public double Apply(double a, double b) {
        return operation.Apply(a,b);
    }
}
