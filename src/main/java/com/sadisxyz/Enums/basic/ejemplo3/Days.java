package main.java.com.sadisxyz.Enums.basic.ejemplo3;

public class Days {
    public enum WeekDays{
        MONDAY("Inicio de Semana, toca camellar"),
        TUESDAY("Martes con energía"),
        WEDNESDAY("Miércoles casi Jueves"),
        THURSDAY("Jueves casi Viernes"),
        FRIDAY("Viernes por fin"),
        SATURDAY("Sábado de vacanería"),
        SUNDAY("Domingo de relajo");
        private final String info;

        @Override
        public String toString(){
            return info;
        }
        WeekDays(String info){
            this.info = info;
        }
    }
    public static void main(String[]args){
        for(WeekDays d : WeekDays.values()){
            System.out.println(d);
        }
    }
}
