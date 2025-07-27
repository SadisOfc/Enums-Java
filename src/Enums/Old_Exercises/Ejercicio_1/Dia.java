package Enums.Old_Exercises.Ejercicio_1;

public enum Dia {
    LUNES("Lunes"), MARTES("Martes"), MIERCOLES("Miercoles"), JUEVES("Jueves"), VIERNES("Viernes"), SABADO("Sabado"), DOMINGO("Domingo");
    private final String fecha;

    Dia(String fecha){
        this.fecha = fecha;
    }
    public String fecha(){
        return fecha;
    }
}

