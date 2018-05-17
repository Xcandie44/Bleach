package spaseodysseyproject.bleach;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Fifth extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
    }

    public void onProtectionClick(View v){
        Intent intent = new Intent(this,Sixth.class);
        startActivity(intent);
    }

    public void onEvolutionClick(View v){
        Intent intent = new Intent(this,Sixth.class);
        startActivity(intent);
    }

    public void onRevengeClick(View v){
        Intent intent = new Intent(this,Sixth.class);
        startActivity(intent);
    }

    public void onSaveClick(View v){
        Intent intent = new Intent(this,Sixth.class);
        startActivity(intent);
    }
}
