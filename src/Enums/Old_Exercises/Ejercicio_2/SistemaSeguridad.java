package Enums.Old_Exercises.Ejercicio_2;
public class SistemaSeguridad {
    public static void main(String[] args) {
        SistemaSeguridad e =  new SistemaSeguridad();
        RolUsuario usuario = RolUsuario.ADMIN;
        e.edicionContenido(usuario);
    }

    public void edicionContenido(RolUsuario usuario){
        int nivel = usuario.getNivel();
        if(nivel >=2){
            System.out.println("Usuario: " + usuario.name());
            System.out.println("Nivel: " + usuario.getNivel());
            System.out.println("Posee los permisos necesarios para Modificar");
        }else{
            System.out.println("No sirve pa un qlo");
        }
    }
}
