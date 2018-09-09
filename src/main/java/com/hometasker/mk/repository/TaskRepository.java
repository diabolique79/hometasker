package com.hometasker.mk.repository;

import com.hometasker.mk.Ids;
import com.hometasker.mk.model.Task;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class TaskRepository {

    Map<Integer, Task> tasks = new HashMap<>();


    public void createNewTask(String taskName, Integer points){

        int newId = Ids.generateNewId(tasks.keySet());
        Task newTask = new Task (newId, taskName, points);
        tasks.put(newId, newTask);
    }

    public List<Task> getAll(){

        return new ArrayList<>(tasks.values());
    }

    public void createTasks(){

        List<Task> taskNames = new ArrayList<>();

        taskNames.add(new Task(1, "Mycie podłóg", 2));
        taskNames.add(new Task(2, "Mycie okien", 15));
        taskNames.add(new Task(3, "Mycie naczyń", 5));
        taskNames.add(new Task(4, "Pranie", 20));

    }

}
