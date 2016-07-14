package jp.techacademy.kiyoshi.ooyama.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    //入力内容
    EditText eText1;
    EditText eText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonTasu= (Button) findViewById(R.id.tasu);
        buttonTasu.setOnClickListener(this);

        Button buttonHiku= (Button) findViewById(R.id.hiku);
        buttonHiku.setOnClickListener(this);

        Button buttonKakeru= (Button) findViewById(R.id.kakeru);
        buttonKakeru.setOnClickListener(this);

        Button buttonWaru= (Button) findViewById(R.id.waru);
        buttonWaru.setOnClickListener(this);


        eText1=(EditText) findViewById(R.id.textEdit1);
        eText2=(EditText) findViewById(R.id.textEdit2);

    }



    @Override
    public void onClick(View v){

        int enzan=0 ;

        if (v.getId() == R.id.tasu) {
            enzan=1;
        } else if (v.getId() == R.id.hiku) {
            enzan=2;
        } else if (v.getId() == R.id.kakeru) {
            enzan=3;
        } else if (v.getId() == R.id.waru) {
            enzan=4;
        }

        //Log.d("CalcApp",eText1.getText().toString());
        //Log.d("CalcApp",eText2.getText().toString());

        Intent intent = new Intent(this,Main2Activity.class);
        intent.putExtra("VALUE1",eText1.getText().toString());
        intent.putExtra("VALUE2",eText2.getText().toString());
        intent.putExtra("ENZAN",enzan);
        startActivity(intent);

    }
}
