package my.edu.tarc.testing123;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Display UI
        //R = resources
        setContentView(R.layout.activity_main);

        //Link variable to UI component
        textViewMessage = (TextView) findViewById(R.id.textViewMessage);
    }

    public void showMessage(View v){
        textViewMessage.setText("Hi my name is Lee Chun Han");
    }
}
