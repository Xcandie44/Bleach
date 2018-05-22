package spaseodysseyproject.bleach;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class Second extends AppCompatActivity {
    RelativeLayout r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_second);
        r = (RelativeLayout) findViewById(R.id.second);
    }

    public void onMaleClick(View v){

        CountDownTimer c = new CountDownTimer(1500, 100){
            @Override
            public void onTick(long millisUntilFinished) {
                r.setBackgroundResource(R.drawable.mayuri2);
            }

            @Override
            public void onFinish() {
                intent();
            }

        }.start();



    }

    public void onFemaleClick(View v){
        Intent intent = new Intent(this,Third.class);
        startActivity(intent);
        overridePendingTransition(R.anim.right,R.anim.left);
    }
    public void onBackPressed(){
    }

    public void intent(){
        Intent intent = new Intent(this,Third.class);
        startActivity(intent);
        overridePendingTransition(R.anim.right,R.anim.left);
    }
}
