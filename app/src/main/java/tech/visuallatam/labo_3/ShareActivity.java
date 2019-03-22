package tech.visuallatam.labo_3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShareActivity extends AppCompatActivity {

    private TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
        mText=findViewById(R.id.shareed_text);
        Intent mIntent = getIntent();
        if(mIntent != null){
            mText.setText(mIntent.getStringExtra(Intent.EXTRA_TEXT));
        }
    }
}
