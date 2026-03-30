import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static ArrayList<Task> tasks = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static int idCounter = 1;;

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Mark Complete");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");


            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    deleteTask();
                    break;
                case 4:
                    markComplete();
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
    public static void addTask(){
        System.out.println("Enter task name: ");
        String name = scanner.nextLine();

        System.out.println("Enter priority (Low/Medium/High): ");
        String priority = scanner.nextLine();;

        Task task = new Task(idCounter, name, priority);
        tasks.add(task);
        idCounter++;
        System.out.println("Task added!");
    }

    public static void viewTasks(){
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public static void deleteTask(){
        System.out.println("Enter task ID: ");
        int id = scanner.nextInt();

        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).id == id) {
                tasks.remove(i);
                System.out.println("Task deleted!");
                return;
            }
        }
        System.out.println("Task not found.");


    }

    public static void markComplete(){
        System.out.println("Enter task ID to mark complete: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for(Task task : tasks) {
            if(task.id == id){
                task.isComplete = true;
                System.out.println("Task marked as complete!");
                return;
            }
            if (task.isComplete){
                System.out.println("Task is already completed.");
                return;
            }
        }
        System.out.println("Task not found.");
    }
}