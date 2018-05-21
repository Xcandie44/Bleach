package spaseodysseyproject.bleach;

import android.app.LauncherActivity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.button);
}

    public void onStartClick(View v){
        Intent intent = new Intent(this,Second.class);
        startActivity(intent);


    }
}
