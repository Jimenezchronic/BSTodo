package android.bs.todo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ToDoAdapter extends ArrayAdapter<ToDolist> {
    public ToDoAdapter(Context context, ArrayList<ToDolist> tasks){
        super(context,0, tasks);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ToDolist task = getItem(position);

        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(android.R.layout.simple_list_item_1,parent,false);
        }

        TextView title = (TextView)convertView.findViewById(android.R.id.text1);
        title.setText(task.textb);
        return convertView;
    }
}
