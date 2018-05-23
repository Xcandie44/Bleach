package spaseodysseyproject.bleach;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;

public class Fifth extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_fifth);
    }

    public void onProtectionClick(View v){
        Intent intent = new Intent(this,Sixth.class);
        startActivity(intent);
        overridePendingTransition(R.anim.right,R.anim.left);
    }

    public void onEvolutionClick(View v){
        Intent intent = new Intent(this,Sixth.class);
        startActivity(intent);
        overridePendingTransition(R.anim.right,R.anim.left);
    }

    public void onRevengeClick(View v){
        Intent intent = new Intent(this,Sixth.class);
        startActivity(intent);
        overridePendingTransition(R.anim.right,R.anim.left);
    }

    public void onSaveClick(View v){
        Intent intent = new Intent(this,Sixth.class);
        startActivity(intent);
        overridePendingTransition(R.anim.right,R.anim.left);
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
    }
}
