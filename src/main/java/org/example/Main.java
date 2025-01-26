package org.example;

import org.example.entity.Priority;
import org.example.entity.Status;
import org.example.entity.Task;
import org.example.entity.TaskData;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");



    Set<Task> annsTasks = new HashSet<>();
        Task taskAnn = new Task("work","dummy desc","ann",Status.IN_PROGRESS, Priority.HIGH );



}
}