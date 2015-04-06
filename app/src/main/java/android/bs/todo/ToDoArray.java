package android.bs.todo;

import java.util.ArrayList;

public class ToDoArray {

    public static ToDoArray todoArray;
    private static ArrayList<ToDolist> tasks;

    private ToDoArray(){
        tasks = new ArrayList<ToDolist>();
    }

    public static ToDoArray get() {
        if(todoArray == null) {
            todoArray = new ToDoArray();
        }
        return todoArray;
    }

    public static void add(ToDolist task){
        tasks.add(task);

    }
}
