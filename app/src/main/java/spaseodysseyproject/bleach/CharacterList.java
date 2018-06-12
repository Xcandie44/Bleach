package spaseodysseyproject.bleach;

import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class CharacterList extends AppCompatActivity {

    int res[] = new int [5];
    ImageView iv1,iv2;
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_list);
        iv1 = findViewById(R.id.ichigo);
        iv1 = findViewById(R.id.rukia);
        preferences = getPreferences(MODE_PRIVATE);
        StringBuilder res_build = new StringBuilder();
        String save = preferences.getString("String","empty");
        if (save.equals("empty")){
            for (int i = 0;i<res.length;i++){
                res[i]=0;
            }
        }
        StringTokenizer st = new StringTokenizer(save,",");
        for(int i = 0;i<res.length;i++){
            res[i] = Integer.parseInt(st.nextToken());
        }
        res[Results.maxNumb] = 1;
        if(res[0]==1){
            iv1.setImageResource(R.drawable.ichigochibihead);
        }else iv1.setImageResource(R.drawable.ichigochibiheaddark);
        if(res[1]==1){
            iv2.setImageResource(R.drawable.rukiachibihead);
        }else iv2.setImageResource(R.drawable.ichigochibiheaddark);

        for(int i=1;i<res.length;i++){
            res_build.append(res[i]);
            res_build.append(",");
        }
        preferences.edit().putString("String",res_build.toString()).apply();
    }
}
