package spaseodysseyproject.bleach;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void onMaleClick(View v){
        Intent intent = new Intent(this,Third.class);
        startActivity(intent);
    }

    public void onFemaleClick(View v){
        Intent intent = new Intent(this,Third.class);
        startActivity(intent);
    }
}