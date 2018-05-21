package spaseodysseyproject.bleach;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Fourth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_fourth);
    }

    public void onYesClick(View v){
        Intent intent = new Intent(this,Fifth.class);
        startActivity(intent);
    }

    public void onNoClick(View v){
        Intent intent = new Intent(this,Fifth.class);
        startActivity(intent);
    }

    public void onMaybeClick(View v){
        Intent intent = new Intent(this,Fifth.class);
        startActivity(intent);
    }

}
