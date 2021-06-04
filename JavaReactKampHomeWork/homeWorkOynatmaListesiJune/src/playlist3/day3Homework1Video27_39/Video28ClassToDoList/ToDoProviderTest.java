package playlist3.day3Homework1Video27_39.Video28ClassToDoList;

import java.util.List;

public class ToDoProviderTest {
    public static void main(String[] args) {
        List<ToDo> model = ToDoProvider.createInitialModel();
        if (model.size() != 5) {
            throw new RuntimeException("size should be 5");
        } else {
            System.out.println("Correct");
        }
        for (ToDo toDoTask : model
        ) {
            System.out.printf("To do task : %s, %s, %s\n", toDoTask.getId(), toDoTask.getSummary(), toDoTask.getDescription());
        }
    }
}

