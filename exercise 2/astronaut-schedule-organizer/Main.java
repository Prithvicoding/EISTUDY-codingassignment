import java.util.Scanner;

// Main.java
public class Main {
    public static void main(String[] args) {
        ScheduleManager scheduleManager = ScheduleManager.getInstance();
        TaskObserver observer = new TaskObserver();
        scheduleManager.registerObserver(observer);

        Scanner scanner = new Scanner(System.in);
        String command;

        do {
            System.out.println("Enter command (add/view/remove/exit):");
            command = scanner.nextLine();

            switch (command.toLowerCase()) {
                case "add":
                    System.out.println("Enter task details (description, start time, end time, priority):");
                    String description = scanner.nextLine();
                    String startTime = scanner.nextLine();
                    String endTime = scanner.nextLine();
                    String priority = scanner.nextLine();
                    Task newTask = TaskFactory.createTask(description, startTime, endTime, priority);
                    scheduleManager.addTask(newTask);
                    break;
                case "view":
                    scheduleManager.viewTasks();
                    break;
                case "remove":
                    System.out.println("Enter task description to remove:");
                    String taskToRemove = scanner.nextLine();
                    scheduleManager.removeTask(taskToRemove);
                    break;
                case "exit":
                    System.out.println("Exiting application.");
                    break;
                default:
                    System.out.println("Invalid command. Try again.");
            }
        } while (!command.equalsIgnoreCase("exit"));

        scanner.close();
    }
}
