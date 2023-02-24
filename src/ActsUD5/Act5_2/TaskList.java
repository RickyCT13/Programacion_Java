package ActsUD5.Act5_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class TaskList {
    List<Task> list;
    private static class Task {
        public String description;
        public boolean isComplete;

        Task(String description) {
            this.description = description;
            this.isComplete = false;
        }

        @Override
        public String toString() {
            String progress;
            if (isComplete) progress = "✔";
            else progress = " ";
            return description + '[' + progress + ']' + "\n";
        }
    }

    TaskList() {}

    TaskList(String storageMode) {
        if (Objects.equals(storageMode, "ArrayList")) {
            list = new ArrayList<>();
        }
        else {
            list = new LinkedList<>();
        }
    }

    public void addTask(String t) {
        list.add(new Task(t));
    }

    public void removeTask(String t) {
        list.removeIf(a -> a.description.equals(t));
    }

    public void completeTask(String t) {
        for (Task a : list) {
            if (a.description.equals(t)) {
                a.isComplete = true;
            }
        }
    }

    public Object[] getTasks() {
        return list.toArray();
    }

}
