package spaseodysseyproject.bleach;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.RelativeLayout;

public class Fifth extends Activity {
    RelativeLayout r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_fifth);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        r = findViewById(R.id.Fifth);
    }

    public void onProtectionClick(View v){
        CountDownTimer c = new CountDownTimer(1500, 100){
            @Override
            public void onTick(long millisUntilFinished) {
                r.setBackgroundResource(R.drawable.yamamoto2);
            }

            @Override
            public void onFinish() {
                intent(Sixth.class);
                overridePendingTransition(R.anim.right,R.anim.left);
            }

        }.start();
    }

    public void onEvolutionClick(View v){
        CountDownTimer c = new CountDownTimer(1500, 100){
            @Override
            public void onTick(long millisUntilFinished) {
                r.setBackgroundResource(R.drawable.yamamoto22);
            }

            @Override
            public void onFinish() {
                intent(Sixth.class);
                overridePendingTransition(R.anim.right,R.anim.left);
            }

        }.start();
    }

    public void onRevengeClick(View v){
        CountDownTimer c = new CountDownTimer(1500, 100){
            @Override
            public void onTick(long millisUntilFinished) {
                r.setBackgroundResource(R.drawable.yamamoto4);
            }

            @Override
            public void onFinish() {
                intent(Sixth.class);
                overridePendingTransition(R.anim.right,R.anim.left);
            }

        }.start();
    }

    public void onSaveClick(View v){
        CountDownTimer c = new CountDownTimer(1500, 100){
            @Override
            public void onTick(long millisUntilFinished) {
                r.setBackgroundResource(R.drawable.yamamoto3);
            }

            @Override
            public void onFinish() {
                intent(Sixth.class);
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
