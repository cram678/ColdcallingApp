package com.example.coldcallingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.net.Uri;
import java.net.URI;

public class MainActivity extends AppCompatActivity {

    private String[] mPeople=new String[]{"aamiarali","adrian_yan","alexaney","bipra_dey","daniel_dulstin","darren_dong","dhruv_amin","eden_kogan","eli_bui","elie_belkin","evelyn_paskhaver","fardin_iqbal","jerry_he","kenny_cao","marc_rosenberg","matthewchen", "michael","minglin","noam","ralf_pacia","samuel_iskhakov","sean","selina_li","shuyue_chen","tanushri_sundaram","vasu","xinrui_ge","zhian_maysoon"};
    private TextView mText;
    private ImageView mImage;
    private Uri uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mText=(TextView)findViewById(R.id.text_value_view);
        String name=mPeople[(int)(Math.random()*33)];
        mText.setText(name);
        mImage=(ImageView)findViewById(R.id.imageView);
        uri= Uri.parse("@drawable/"+name);
        mImage.setImageURI(uri);
    }


}