// TaskObserver.java
public class TaskObserver implements Observer {
    @Override
    public void update(Task task) {
        System.out.println("Notification: New task added - " + task.getDescription());
    }
}
