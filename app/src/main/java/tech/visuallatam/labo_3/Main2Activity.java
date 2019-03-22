package tech.visuallatam.labo_3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import tech.visuallatam.labo_3.utils.AppConstants;

public class Main2Activity extends AppCompatActivity {

    private TextView mText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mText = findViewById(R.id.texto);
        Intent mIntent = getIntent();
        if (mIntent != null){
            mText.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY));
        }
    }
}
