package ActsUD5.Act5_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class TaskList {
    List<String> tasks;
    boolean isComplete;

    TaskList() {}

    TaskList(String storageMode) {
        if (Objects.equals(storageMode, "ArrayList")) {
            tasks = new ArrayList<>();
        }
        else {
            tasks = new LinkedList<>();
        }
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void removeTask(String task) {
        tasks.remove(task);
    }

    public void completeTask(String task) {
        tasks.get(tasks.indexOf(task))
    }

    public String[] getTasks() {

    }

}
