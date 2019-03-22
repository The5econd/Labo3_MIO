package tech.visuallatam.labo_3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import tech.visuallatam.labo_3.utils.AppConstants;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    private Button mButton, mButtonShare;

    @Override
    //Serializable
    //Parceable
    //Bundle
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton=findViewById(R.id.btn_send);
        mButtonShare=findViewById(R.id.boton2);

        mButton.setOnClickListener(v->{
            Intent mIntent = new Intent(MainActivity.this, Main2Activity.class);
            mIntent.putExtra(AppConstants.TEXT_KEY, "Hola, NewActivity, el chino se la come");
            startActivity(mIntent);
        });

        mButtonShare.setOnClickListener(v->{
            Intent mIntent = new Intent();
            mIntent.setAction(Intent.ACTION_SEND);
            mIntent.setType("text/plain");
            mIntent.putExtra(Intent.EXTRA_TEXT,"gfloejfngli");
            startActivity(mIntent);
        });
    }
}
