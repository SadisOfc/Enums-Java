package Enums.Old_Exercises;

public class Maincito {
    public static void main(String[] args) {
        Enumcitos enumss = Enumcitos.DESARROLLADOR;
        switch (enumss) {
            case DESARROLLADOR:
                System.out.println("Hola");
                break;
            case SOPORTE_TECNICO:
                System.out.println("No hola");
                break;
            case GERENTE:
                System.out.println("Puta");
                break;
            default:
                break;
        }
    }
}
