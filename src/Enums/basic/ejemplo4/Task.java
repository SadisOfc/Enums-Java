package Enums.basic.ejemplo4;

public class Task {
    private String tarea;
    private Priority prioridad;
    public Task(String tarea, Priority prioridad){
        this.prioridad = prioridad;
        this.tarea = tarea;
    }
    public Priority getPrioridad(){
        return prioridad;
    }
    public String getTarea(){
        return tarea;
    }
    public String toString(){
        return tarea + " - prioridad " + prioridad;
    }
}
