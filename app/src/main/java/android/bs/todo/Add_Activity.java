package android.bs.todo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Add_Activity extends Activity {


    public Button save;
    public EditText textB;
    public EditText textB2;
    public EditText textB3;
    public EditText textB4;
    public EditText noteB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        save = (Button) findViewById(R.id.saveB);
        textB = (EditText) findViewById(R.id.Tbox);
        textB2 = (EditText) findViewById(R.id.Tbox2);
        textB3 = (EditText) findViewById(R.id.Tbox3);
        noteB = (EditText) findViewById(R.id.Notes);

        save.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), Todays_Activity.class);
                intent.putExtra("Title",textB.getText().toString());
                intent.putExtra("Task",textB2.getText().toString());
                intent.putExtra("Date/Time",textB3.getText().toString());
                intent.putExtra("Notes",noteB.getText().toString());


                startActivity(intent);

                Toast toast = Toast.makeText(getApplication(),"Your List Has Been Created.", Toast.LENGTH_SHORT);
                toast.show();

                ;
            }
        } );



    }
}

