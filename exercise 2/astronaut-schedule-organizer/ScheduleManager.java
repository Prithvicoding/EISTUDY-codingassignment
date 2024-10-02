import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// ScheduleManager.java
public class ScheduleManager {
    private static ScheduleManager instance;
    private List<Task> tasks;
    private List<TaskObserver> observers;

    private ScheduleManager() {
        tasks = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public static ScheduleManager getInstance() {
        if (instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }

    public void addTask(Task task) {
        if (validateTask(task)) {
            tasks.add(task);
            Collections.sort(tasks, Comparator.comparing(Task::getStartTime));
            notifyObservers(task);
            System.out.println("Task added successfully. No conflicts.");
        } else {
            System.out.println("Error: Task conflicts with existing task.");
        }
    }

    public void removeTask(String description) {
        Task taskToRemove = null;
        for (Task task : tasks) {
            if (task.getDescription().equals(description)) {
                taskToRemove = task;
                break;
            }
        }
        if (taskToRemove != null) {
            tasks.remove(taskToRemove);
            System.out.println("Task removed successfully.");
        } else {
            System.out.println("Error: Task not found.");
        }
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks scheduled for the day.");
        } else {
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }

    public void registerObserver(TaskObserver observer) {
        observers.add(observer);
    }

    private void notifyObservers(Task task) {
        for (TaskObserver observer : observers) {
            observer.update(task);
        }
    }

    private boolean validateTask(Task newTask) {
        for (Task existingTask : tasks) {
            if (isOverlapping(existingTask, newTask)) {
                return false;
            }
        }
        return true;
    }

    private boolean isOverlapping(Task existingTask, Task newTask) {
        // Add time validation logic here
        return (newTask.getStartTime().compareTo(existingTask.getEndTime()) < 0 && 
                newTask.getEndTime().compareTo(existingTask.getStartTime()) > 0);
    }
}
