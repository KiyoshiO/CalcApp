package jp.techacademy.kiyoshi.ooyama.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String value1 = intent.getStringExtra("VALUE1");
        String value2 = intent.getStringExtra("VALUE2");
        int enzan = intent.getIntExtra("ENZAN",0);


        Log.d("CalcApp",value1 + "  " + value2 +"  (" + enzan + ")");
        double anser=0;
        double dvalue1 = Double.valueOf(value1);
        double dvalue2 = Double.valueOf(value2);
        String anserText="";

        if (enzan == 1 ){
            anser=dvalue1+dvalue2;
            anserText=String.valueOf(anser);
        } else if (enzan == 2 ){
            anser=dvalue1-dvalue2;
            anserText=String.valueOf(anser);
        } else if (enzan == 3 ){
            anser=dvalue1*dvalue2;
            anserText=String.valueOf(anser);
        } else if (enzan == 4) {
            if (dvalue2 == 0){
                anserText="０で除算できません";
            } else {
                anser = dvalue1 / dvalue2;
                anserText=String.valueOf(anser);
            }
        }



        TextView textview = (TextView) findViewById(R.id.textView);
        textview.setText(anserText);
    }
}
