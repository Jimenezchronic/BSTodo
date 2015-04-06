package android.bs.todo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Todays_Activity extends Activity {

    public Button backButton;
    public Button buttonA;
    private ToDolist task;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todaylist);
        backButton = (Button) findViewById(R.id.MenuB);

        String extra = getIntent().getStringExtra("Title");
        String extra2 = getIntent().getStringExtra("Task");
        String extra3 = getIntent().getStringExtra("Date/Time");
        String extra4 = getIntent().getStringExtra("Notes");

        task = new ToDolist(extra, extra2, extra3, extra4);
        ToDoArray.get().add(task);

        backButton.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), TodoActivity.class);

                startActivity(intent);

            }
        } );


        buttonA = (Button) findViewById(R.id.AddB);

        buttonA.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), Add_Activity.class);

                startActivity(intent);

            }
        } );


    }
}
