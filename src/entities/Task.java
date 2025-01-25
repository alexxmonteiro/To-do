package entities;

public class Task {
	//this class is responsible for the tasks
	
	//variables
	private String tasks;
	private String description;
	
	//constructor
	public Task() {
	}

	public Task(String tasks, String desc) {
		this.tasks = tasks;
		this.description = desc;
	}

	//getters and setters
	public String getTasks() {
		return tasks;
	}

	public void setTasks(String tasks) {
		this.tasks = tasks;
	}

	public String getHour() {
		return description;
	}

	public void setHour(String desc) {
		this.description = desc;
	}
}

