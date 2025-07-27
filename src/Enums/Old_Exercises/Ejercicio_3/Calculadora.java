package Enums.Old_Exercises.Ejercicio_3;

public class Calculadora {
    public static void main(String[] args) {
        Calculadora e = new Calculadora();
        TipoOperacion op = TipoOperacion.MULTIPLICACION;
        e.calcular(op, 17, 2);
    }

    public void calcular(TipoOperacion op, double a, double b){
        double resultado = op.ejecutar(a, b);
        System.out.println("Operación: " + op.name());
        System.out.println(resultado);
    }
}
