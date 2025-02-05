package entities;

public class Tasks {

    //variables Task and desc (for the Task name and description)
    private String task;
    private String desc;

    //constructor(s)
    public Tasks(){}

    public Tasks(String task, String desc) {
        this.task = task;
        this.desc = desc;
    }

    //getters and setters
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
}
