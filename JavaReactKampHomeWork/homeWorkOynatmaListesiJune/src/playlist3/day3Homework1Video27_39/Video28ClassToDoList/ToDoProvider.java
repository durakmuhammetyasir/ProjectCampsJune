package playlist3.day3Homework1Video27_39.Video28ClassToDoList;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ToDoProvider extends ToDo{
    private static int current = 0;

    public ToDoProvider(long id, String summary, String description, boolean done, Date dueDate) {
        super(id, summary, description, done, dueDate);
    }

    // example data, change if you like
    public static List<ToDo> createInitialModel() {
        ArrayList<ToDo> list = new ArrayList<ToDo>();
        list.add(createToDo("JFace", "Especially Viewers!"));
        list.add(createToDo("DI", "@Inject looks interesting"));
        list.add(createToDo("Compatibility Layer", "Run Eclipse 3.x"));
        list.add(createToDo("SWT", "Learn Widgets"));
        list.add(createToDo("OSGi", "Services"));
        return list;
    }

    private static ToDo createToDo(String summary, String description) {
        return new ToDo(current++, summary, description, false, new Date());
    }
}
