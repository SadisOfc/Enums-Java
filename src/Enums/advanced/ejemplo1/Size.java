package Enums.advanced.ejemplo1;

public enum Size {
    PEQUEÑO(1.0),MEDIANO(1.20),GRANDE(1.30);
    private final double multiplicador;
    Size(double multiplicador){
        this.multiplicador = multiplicador;
    }
    public double getMultiplicador(){
        return multiplicador;
    }
}
