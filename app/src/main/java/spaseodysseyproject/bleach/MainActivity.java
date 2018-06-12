package spaseodysseyproject.bleach;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.LauncherActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button b1;
    private static Fragment f1;
    static FragmentTransaction ft;
    private FrameLayout fragmentContainer;
    LayoutInflater inflater;
    ViewGroup container;
    Bundle savedInstanceState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.button);
        fragmentContainer = findViewById(R.id.frame);
}

    public void openFragment(){
        android.support.v4.app.Fragment f1 = new Fragment1();
        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.setCustomAnimations(R.anim.enter_from_right,R.anim.exit_to_right,R.anim.enter_from_right,R.anim.exit_to_right);
        transaction.addToBackStack(null);
        transaction.add(R.id.frame,f1).commit();
       /* Fragment f1 = new Fragment1();
        ft = getFragmentManager()
                .beginTransaction()
                //.setCustomAnimations(R.anim.slide_in_left,R.anim.slide_out_left)
                .replace(R.id.frame,f1)
                .addToBackStack(null);
        ft.commit();*/

    }

    public void onStartClick(View v){
        /*LayoutInflater inflater1 = getLayoutInflater();
        View view1 = inflater1.inflate(R.layout.activity_main,null,false);
        view1.startAnimation(AnimationUtils.loadAnimation(this, left));
        setContentView(view1);*/
     /*   LayoutInflater inflater2 = getLayoutInflater();
        View view2 = inflater2.inflate(R.layout.activity_second,null,false);
        view2.startAnimation(AnimationUtils.loadAnimation(this,R.anim.right));
        setContentView(view2);*/
        Intent intent = new Intent(this,Second.class);
        startActivity(intent);
        overridePendingTransition(R.anim.right,R.anim.left);
        finish();
       // setContentView(R.layout.activity_second);
      //openFragment();
    }

   /* public void onBackPressed(){
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
                });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }*/
}
