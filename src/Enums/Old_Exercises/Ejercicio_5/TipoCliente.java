package Enums.Old_Exercises.Ejercicio_5;

public enum TipoCliente implements Descuento {
    GENERAL{
        @Override
        public double aplicarDescuento(double precio) {
            precio-=precio*0;
            return precio;
        }
    }, EMPRESA{
        @Override
        public double aplicarDescuento(double precio) {
            precio-=precio*0.10;
            return precio;
        }
    }, ESTUDIANTE{
        @Override
        public double aplicarDescuento(double precio) {
            precio-=precio*0.20;
            return precio;
        }
    };
}
