package Enums.Old_Exercises.Ejercicio_1;

public class Semana {
    public static void main(String[] args) {
        Semana e = new Semana();
        Dia dias = Dia.SABADO;
        e.finDeSemana(dias);
    }
    public void finDeSemana(Dia dias){
        boolean s = false;
        System.out.println("Hoy es " + dias.fecha());
        if(dias==Dia.DOMINGO || dias== Dia.SABADO){
            s=true;
        }
        if(s){
            System.out.println("Descansa, es fin de semana");
        }else{
            System.out.println("Ánimo, es día laboral");
        }
    }
}
