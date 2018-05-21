package spaseodysseyproject.bleach;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Third extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_third);
    }

    public void onKidoClick(View v){
        Intent intent = new Intent(this,Fourth.class);
        startActivity(intent);
    }

    public void onFencingClick(View v){
        Intent intent = new Intent(this,Fourth.class);
        startActivity(intent);
    }

    public void onFightClick(View v){
        Intent intent = new Intent(this,Fourth.class);
        startActivity(intent);
    }
}
