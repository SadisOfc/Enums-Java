package Enums.Old_Exercises.Ejercicio_2;
public enum RolUsuario{
    ADMIN(3), MODERADOR(2), USUARIO(1);

    private final int nivel;

    RolUsuario(int nivel){
        this.nivel = nivel;
    }

    public int getNivel(){
        return nivel;
    }
}