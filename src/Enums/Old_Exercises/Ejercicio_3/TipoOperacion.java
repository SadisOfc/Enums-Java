package Enums.Old_Exercises.Ejercicio_3;

public enum TipoOperacion implements Operacion {
    SUMA{
        @Override
        public double ejecutar(double a, double b) {
            return a+b;
        }
    },RESTA{
        @Override
        public double ejecutar(double a, double b) {
            return a-b;
        }
    },MULTIPLICACION{
        @Override
        public double ejecutar(double a, double b) {
            return a*b;
        }
    },DIVISION{
        @Override
        public double ejecutar(double a, double b) {
            return a/b;
        }
    };
    }

