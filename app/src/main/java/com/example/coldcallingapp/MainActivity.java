package com.example.coldcallingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Student[] mstudents = new Student[]{
            new Student("aamiarali", "Aamir Ali"),
            new Student("adrian_yan", "Adrian Yan"),
            new Student("alexaney", "Alex Aney"),
            new Student("bipra_dey", "Bipra Dey"),
            new Student("daniel_dulstin", "Daniel Dulstin"),
            new Student("darren_dong", "Darren Dong"),
            new Student("dhruv_amin", "Dhruv Amin"),
            new Student("eden_kogan", "Eden Kogan"),
            new Student("eli_bui", "Eli Bui"),
            /*new Student("elie_belkin", "Elie Belkin"),
            new Student("evelyn_paskhaver", "Evelyn Paskhaver"),
            new Student("fardin_iqbal", "Fardin Iqbal"),
            new Student("jerry_he", "Jerry He")*/
    };
    //private String[] mPeople= new String[]{"aamiarali","adrian_yan","alexaney","bipra_dey","daniel_dulstin","darren_dong","dhruv_amin","eden_kogan","eli_bui","elie_belkin","evelyn_paskhaver","fardin_iqbal","jerry_he","kenny_cao","marc_rosenberg","matthewchen", "michael","minglin","noam","ralf_pacia","samuel_iskhakov","sean","selina_li","shuyue_chen","tanushri_sundaram","vasu","xinrui_ge","zhian_maysoon"};
    private TextView mText;
    private ImageView mImage;
    private Button mRandomButton;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mText=(TextView)findViewById(R.id.text_value_view);
        int studentIndex = (int)(Math.random()*12);
        String name = (mstudents[studentIndex]).getName();
        mText.setText((mstudents[studentIndex]).getDisplayName());
        mImage=(ImageView)findViewById(R.id.imageView);
        String uri = "@drawable/"+name;
        int imageResource = getResources().getIdentifier(uri, null, getPackageName());
        Drawable res = getResources().getDrawable(imageResource);
        mImage.setImageDrawable(res);
<<<<<<< Updated upstream
    }
    mRandomButton = (Button) findViewById(R.id.next_button);
    mRandomButton.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
            mText=(TextView)findViewById(R.id.text_value_view);
            int studentIndex = (int)(Math.random()*12);
            String name = (mstudents[studentIndex]).getName();
            mText.setText((mstudents[studentIndex]).getDisplayName());
            mImage=(ImageView)findViewById(R.id.imageView);
            String uri = "@drawable/"+name;
            int imageResource = getResources().getIdentifier(uri, null, getPackageName());
            Drawable res = getResources().getDrawable(imageResource);
            mImage.setImageDrawable(res);
        }
    });
=======
        (mstudents[studentIndex]).setCalled(true);

        mRandomButton = (Button) findViewById(R.id.next_button);
        mRandomButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mText=(TextView)findViewById(R.id.text_value_view);
                int studentIndex = (int)(Math.random()*12);
                String name = (mstudents[studentIndex]).getName();
                mText.setText((mstudents[studentIndex]).getDisplayName());
                mImage=(ImageView)findViewById(R.id.imageView);
                String uri = "@drawable/"+name;
                int imageResource = getResources().getIdentifier(uri, null, getPackageName());
                Drawable res = getResources().getDrawable(imageResource);
                mImage.setImageDrawable(res);
                (mstudents[studentIndex]).setCalled(true);
            }
        });
        button = (Button) findViewById(R.id.called_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

    }
    public void openActivity2() {
        Intent intent = new Intent(this, called.class);
        startActivity(intent);
    }
>>>>>>> Stashed changes


}