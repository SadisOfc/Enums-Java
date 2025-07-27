package Enums.basic.example2;

public class Colors {
    public enum Color{
        YELLOW("Yellow Color"), RED("Red Color"), GREEN("Green Color"), BLUE("Blue Color");
        private final String txt;
        Color(String txt){
            this.txt = txt;
        }
        @Override
        public String toString(){
            return "Information: " + txt;
        }
    }
    public static void main(String[]args){
        System.out.println("-------------------------------");
        System.out.println("Colors - Information");
        for(Color c : Color.values()){
            System.out.println(c.name() + " - " + c);
        }
    }
}

