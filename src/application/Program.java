package application;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Task;

public class Program {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// the program will save the archive in this path
		String path = "c:\\temp\\in.txt";

		List<Task> task = new ArrayList<>();
		// initializing bufferedWriter
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {

			// first question to initialize the while
			System.out.println("What action you want to do?");
			System.out.println("1. Add task");
			System.out.println("2. Remove task");
			System.out.println("3. Mark has a finished task");
			System.out.println("4. End");
			int type_task = sc.nextInt();

			while (type_task == 3 || type_task == 2) {
				// guarantees you can´t remove or mark has finished if you don´t add a item
				System.out.print("you have to add a task first...");
				type_task = sc.nextInt();
			}

			// if type_task equal to 4, end
			while (type_task != 4) {
				// if type_task is equal to 1, add operation
				if (type_task == 1) {
					System.out.println("Enter task info...");
					System.out.print("name: ");
					sc.nextLine();
					String name = sc.nextLine();
					System.out.print("description: ");
					String desc = sc.nextLine();

					// send the operation to class 'Task'
					task.add(new Task(name, desc));
				} else if (type_task == 2) {
					// if type_task is equal to 2, remove task and if task have one or more items
					System.out.print("Enter name of the task you want to exclude: ");
					sc.nextLine();
					String name_remove = sc.nextLine();

					task.removeIf(t -> t.getTasks().equals(name_remove));
				}

				System.out.print("another action: ");
				type_task = sc.nextInt();
			}

			System.out.println("list:");
			for (Task t : task) {
				System.out.println("tasks: " + t.getTasks());
				System.out.println("description: " + t.getDesc());
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InputMismatchException e) {
			e.printStackTrace();
		}

		sc.close();
	}

}
