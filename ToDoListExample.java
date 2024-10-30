import java.util.ArrayList;
import java.util.List;

public class ToDoListExample {

    // Using constants for message display
    private static final String TASKS_HEADER = "Tasks to do:";
    private static final String REMAINING_TASKS_HEADER = "\nRemaining tasks:";

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();

        // Step 1: Add tasks
        toDoList.addTask("Buy groceries");
        toDoList.addTask("Complete homework");
        toDoList.addTask("Call the plumber");

        // Step 2: Display tasks
        toDoList.printTasks(TASKS_HEADER);

        // Step 3: Mark task as complete
        toDoList.completeTask("Complete homework");

        // Step 4: Display remaining tasks
        toDoList.printTasks(REMAINING_TASKS_HEADER);
    }
}

// Separate class to manage ToDo list functionality
class ToDoList {
    private final List<String> tasks;

    public ToDoList() {
        this.tasks = new ArrayList<>();
    }

    // Method to add a new task
    public void addTask(String task) {
        if (task == null || task.trim().isEmpty()) {
            System.out.println("Cannot add an empty task.");
            return;
        }
        tasks.add(task);
    }

    // Method to mark a task as complete
    public void completeTask(String task) {
        if (tasks.contains(task)) {
            tasks.remove(task);
            System.out.println("Task completed: " + task);
        } else {
            System.out.println("Task not found: " + task);
        }
    }

    // Method to print tasks with a header
    public void printTasks(String header) {
        System.out.println(header);
        for (String task : tasks) {
            System.out.println("- " + task);
        }
    }
}
