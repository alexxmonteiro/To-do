package entities;

import java.util.ArrayList;
import java.util.List;

public class Task_check {
	//this class is responsible for check how many tasks has been
	//completed and to check the number of tasks
	
	//variables
	private Boolean complete;
	private Integer number_of_tasks;
	
	List<Task> task = new ArrayList<>();
	
	//constructors
	public Task_check() {
	}

	public Task_check(Boolean complete, List<Task> task, Integer number_of_tasks) {
		this.complete = complete;
		this.task = task;
	}
	
	//getters and setters
	public Boolean getComplete() {
		return complete;
	}

	public void setComplete(Boolean complete) {
		this.complete = complete;
	}

	public Integer getNumber_of_tasks() {
		return number_of_tasks;
	}

	public void setNumber_of_tasks(Integer number_of_tasks) {
		this.number_of_tasks = number_of_tasks;
	}
	
	public List<Task> getTask() {
		return task;
	}

	//list add operation
	public void addTask(Task task) {
		this.task.add(task);
	}
	
	public void removeTask(Task task) {
		this.task.remove(task);
	}
}

