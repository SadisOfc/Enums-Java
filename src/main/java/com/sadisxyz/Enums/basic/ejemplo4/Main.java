package main.java.com.sadisxyz.Enums.basic.ejemplo4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Task> taskList = new ArrayList<>();
        Task task1 = new Task("Limpiar el cuarto", Priority.LOW);
        taskList.add(task1);
        Task task2 = new Task("Programar en java con spring", Priority.HIGH);
        taskList.add(task2);
        Task task3 = new Task("Hacer ejercicio", Priority.MEDIUM);
        taskList.add(task3);
        taskList.stream().sorted(Comparator.comparingInt((Task tarea) -> tarea.getPrioridad().getNum()).reversed()).forEach(System.out::println);
    }
}
