package Enums.basic.example4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Task> taskList = new ArrayList<>();
        Task task1 = new Task("Clean the room", Priority.LOW);
        taskList.add(task1);
        Task task2 = new Task("Program in Java with Spring", Priority.HIGH);
        taskList.add(task2);
        Task task3 = new Task("Exercise", Priority.MEDIUM);
        taskList.add(task3);
        taskList.stream()
                .sorted(Comparator.comparingInt((Task task) -> task.getPriority().getNum()).reversed())
                .forEach(System.out::println);
    }
}