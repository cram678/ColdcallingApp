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
            new Student("elie_belkin", "Elie Belkin"),
            new Student("evelyn_paskhaver", "Evelyn Paskhaver"),
            new Student("fardin_iqbal", "Fardin Iqbal"),
            new Student("jerry_he", "Jerry He"),
            new Student("kenny_cao", "Kenny Cao"),
            new Student("marc_rosenberg", "Marc Rosenberg"),
            new Student("matthewchen", "Matthew Chen"),
            new Student("minglin", "Ming Lin"),
            new Student("noam", "Noam"),
            new Student("ralf_pacia", "Ralf Pacia"),
            new Student("samuel_iskhakov", "Samuel Iskhakov"),
            new Student("sean", "Sean"),
            new Student("selina_li", "Selina Li"),
            new Student("sean", "Sean"),
            new Student("shuyue_chen", "Shuyue Chen"),
            new Student("tanushri_sundaram", "Tanushri Sundaram"),
            new Student("vasu", "Vasu"),
            new Student("xinrui_ge", "Xinrui Ge"),
            new Student("zhian_maysoon", "Zhian Maysoon"),
    };
    private TextView mText;
    private ImageView mImage;
    private Button mRandomButton;
    private Button button;
    private Button unButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        random();

        mRandomButton = (Button) findViewById(R.id.next_button);
        mRandomButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                random();
            }
        });

        button = (Button) findViewById(R.id.called_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = called.newIntent(MainActivity.this, called_string());
                startActivity(i);
            }
        });

        unButton = (Button) findViewById(R.id.uncalled_button);
        unButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = uncalled.newIntent(MainActivity.this, uncalled_string());
                startActivity(i);
            }
        });

    }

    public void random(){
        mText=(TextView)findViewById(R.id.text_value_view);
        int studentIndex = (int)(Math.random()*27);

        //find student not called in past 40 mins
        while((mstudents[studentIndex]).fourty_min_called()){
            studentIndex = (int)(Math.random()*27);
        }

        //update the time called
        (mstudents[studentIndex]).setTime_called(System.currentTimeMillis());

        //display the student on the app
        String name = (mstudents[studentIndex]).getName();
        mText.setText((mstudents[studentIndex]).getDisplayName());
        mImage=(ImageView)findViewById(R.id.imageView);
        String uri = "@drawable/"+name;
        int imageResource = getResources().getIdentifier(uri, null, getPackageName());
        Drawable res = getResources().getDrawable(imageResource);
        mImage.setImageDrawable(res);
    }

    //this method returns a string of students called in the last 40 mins
    public String called_string(){
        String temp = "";
        for(int i = 0; i < 28; i++){
            if((mstudents[i]).fourty_min_called()){
                temp += ", \n"+(mstudents[i]).getName();
            }
        }
        return temp;
    }

    //this method returns a string of students called in the last 40 mins
    public String uncalled_string(){
        String temp = "";
        for(int i = 0; i < 28; i++){
            if((mstudents[i]).day_uncalled()){
                temp += ", \n"+(mstudents[i]).getName();
            }
        }
        return temp;
    }

}
