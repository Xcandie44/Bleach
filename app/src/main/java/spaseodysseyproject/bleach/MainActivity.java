package spaseodysseyproject.bleach;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.button);
        b1.setVisibility(View.INVISIBLE);
        b1.setEnabled(true);
    }

    public void onStartClick(View v){
        Intent intent = new Intent(this,Second.class);
        startActivity(intent);


    }
}
