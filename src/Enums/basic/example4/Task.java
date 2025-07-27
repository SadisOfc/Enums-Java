package Enums.basic.example4;

public class Task {
    private String task;
    private Priority priority;
    public Task(String task, Priority priority){
        this.priority = priority;
        this.task = task;
    }
    public Priority getPriority(){
        return priority;
    }
    public String getTask(){
        return task;
    }
    public String toString(){
        return task + " - Priority " + priority;
    }
}
