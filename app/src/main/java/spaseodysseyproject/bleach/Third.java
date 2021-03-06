package spaseodysseyproject.bleach;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.CountDownTimer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class Third extends AppCompatActivity {
    RelativeLayout r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_third);
        r = (RelativeLayout) findViewById(R.id.third);
    }

    public void onKidoClick(View v){
        CountDownTimer c = new CountDownTimer(1500, 100){
            @Override
            public void onTick(long millisUntilFinished) {
                r.setBackgroundResource(R.drawable.ikkaku2);
            }

            @Override
            public void onFinish() {
                intent(Fourth.class);
                overridePendingTransition(R.anim.right,R.anim.left);
            }

        }.start();
    }

    public void onFencingClick(View v){
        Result.res[0]+=1;
        Result.res[1]+=1;
        Result.res[2]+=1;
        Result.res[4]+=1;
        CountDownTimer c = new CountDownTimer(1500, 100){
            @Override
            public void onTick(long millisUntilFinished) {
                r.setBackgroundResource(R.drawable.ikkaku3);
            }

            @Override
            public void onFinish() {
                intent(Fourth.class);
                overridePendingTransition(R.anim.right,R.anim.left);
            }

        }.start();
    }

    public void onFightClick(View v){
        Result.res[3]+=1;
        CountDownTimer c = new CountDownTimer(1500, 100){
            @Override
            public void onTick(long millisUntilFinished) {
                r.setBackgroundResource(R.drawable.ikkaku4);
            }

            @Override
            public void onFinish() {
                intent(Fourth.class);
                overridePendingTransition(R.anim.right,R.anim.left);
            }

        }.start();
    }

    public void onBackPressed(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false)
                .setMessage(R.string.quit)
                .setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finishAffinity();
                    }
                })
                .setNegativeButton(R.string.no, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                })
                .setNeutralButton(R.string.main, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        intent(MainActivity.class);
                        overridePendingTransition(R.anim.right_b,R.anim.left_b);
                    }
                });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void intent(Class c){
        Intent intent = new Intent(this,c);
        startActivity(intent);
        finish();
    }
}
