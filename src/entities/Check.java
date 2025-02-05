package entities;

import java.util.ArrayList;
import java.util.List;

public class Check {

    //List of Strings (this one have to stock the completed Tasks)
    List<String> CompletedTasks = new ArrayList<>();

    //List of Tasks (this one have to stock the tasks)
    List<Tasks> task = new ArrayList<>();

    //constructor(s)
    public Check(){}

    //add and remove ops
    public void addTask(Tasks tasks){
        task.add(tasks);
    }

    public void removeTask(Tasks tasks) {
        task.remove(tasks);
    }
}
