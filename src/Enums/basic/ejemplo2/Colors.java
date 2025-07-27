package Enums.basic.ejemplo2;

public class Colors {
    public enum Color{
        AMARILLO("Color Amarillo"),ROJO("Color Rojo"),VERDE("Color Verde"),AZUL("Color Azul");
        private final String txt;
        Color(String txt){
            this.txt = txt;
        }
        @Override
        public String toString(){
            return "Información: " + txt;
        }
    }
    public static void main(String[]args){
        System.out.println("-------------------------------");
        System.out.println("Colores - Información");
        for(Color c : Color.values()){
            System.out.println(c.name() + " - " + c);
        }
    }
}

