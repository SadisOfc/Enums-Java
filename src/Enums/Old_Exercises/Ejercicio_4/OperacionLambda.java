package Enums.Old_Exercises.Ejercicio_4;

public enum OperacionLambda implements Operacion{
    SUMAR((a,b)->a+b),
    RESTAR((a,b)->a-b),
    MULTIPLICAR((a,b)->a*b),
    DIVIDIR((a,b)->{
        if(b==0)throw new ArithmeticException("División por cero");
        return a/b;
    });

    private final Operacion operacion;
    OperacionLambda(Operacion operacion){
        this.operacion = operacion;
    }

    @Override
    public double ejecutar(double a, double b) {
        return operacion.ejecutar(a, b);
    }
}
