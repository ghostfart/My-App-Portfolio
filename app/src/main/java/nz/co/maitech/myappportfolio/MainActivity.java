package nz.co.maitech.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void announce (View view) {
        Button btn = (Button) view;
        String msg = "This button will launch my " + btn.getText().toString().toLowerCase() + " app!";
        Toast.makeText(this, msg,Toast.LENGTH_SHORT).show();
    }
}