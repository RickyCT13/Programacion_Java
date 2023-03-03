package ActsUD5.Act5_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TaskList {
    /**
     * El campo de esta clase será una lista de objetos de la clase interna Task
     */
    List<Task> list;

    /**
     * Clase interna Task con descripción y si está hecha o no.
     */
    private static class Task {
        public String description;
        public boolean isComplete;

        Task(String description) {
            this.description = description;
            this.isComplete = false;
        }

        /**
         * @return String con los valores de la tarea
         */
        @Override
        public String toString() {
            String progress;
            if (isComplete) progress = "\u2714";
            else progress = " ";
            return description + '[' + progress + ']' + "\n";
        }
    }

    /**
     * @param storageMode Decide si se usará ArrayList o LinkedList mediante el polimorfismo.
     *                    Insensitivo al caso. Es obligatorio especificar el tipo y que este sea uno de los dos soportados.
     *                    Si no es así, dará un error.
     * @throws NullPointerException en caso de que se intente añadir, borrar o modificar la lista al no especificar el tipo
     * de almacenaje.
     */
    TaskList(String storageMode) {
        if (storageMode.equalsIgnoreCase("ArrayList")) {
            list = new ArrayList<>();
        }
        else if (storageMode.equalsIgnoreCase("LinkedList")) {
            list = new LinkedList<>();
        }
        else System.out.println("Error: tipo de almacenaje desconocido / no soportado.");
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
