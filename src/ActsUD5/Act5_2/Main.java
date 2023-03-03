package ActsUD5.Act5_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Vamos a crear una nueva lista, en este caso de la compra
        TaskList groceries = new TaskList("ArrayList");
        groceries.addTask("Bread");
        groceries.addTask("Butter");
        groceries.addTask("Milk");
        groceries.addTask("Cereal");
        groceries.addTask("Soda");

        System.out.println(Arrays.toString(groceries.getTasks()));

        groceries.completeTask("Bread");
        groceries.completeTask("Milk");

        System.out.println(Arrays.toString(groceries.getTasks()));

        groceries.removeTask("Bread");
        groceries.removeTask("Milk");

        System.out.println(Arrays.toString(groceries.getTasks()));

        TaskList plansForToday = new TaskList("LinkedList");
        plansForToday.addTask("aaa");
        plansForToday.addTask("A");

        System.out.println(Arrays.toString(plansForToday.getTasks()));

        TaskList someList = new TaskList("a");
        someList.addTask("Do the dishes");

    }
}
