public class Task {
    int id;
    String name;
    boolean isComplete;
    String priority;

    public Task(int id, String name,  String priority ){
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.isComplete = false;

    }
    @Override
    public String toString() {
        return "ID: " + id +
                " | Task: " + name +
                " | Priority: " + priority +
                " | Status: " + (isComplete ? "Completed" : "Incomplete");
    }
}
