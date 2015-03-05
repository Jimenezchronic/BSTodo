package android.bs.todo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Add_Activity extends Activity {

    public Button buttonA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todaylist);
        buttonA = (Button) findViewById(R.id.AddB);

        buttonA.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                Toast toast = Toast.makeText(getApplication(),"The button works!", Toast.LENGTH_SHORT);
                toast.show();

            }
        } );



    }
}
