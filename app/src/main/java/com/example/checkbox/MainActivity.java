package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
     private CheckBox mgreen,myellow,mblack,mred,mblue;
     private Button mbtn;
     private TextView mtv;
     private ArrayList<String> mresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mgreen=findViewById(R.id.grn);
        myellow=findViewById(R.id.ylw);
        mblack=findViewById(R.id.blk);
        mred=findViewById(R.id.rd);
        mblue=findViewById(R.id.bl);
        mbtn=findViewById(R.id.button);
        mtv=findViewById(R.id.result);
        mresult=new ArrayList<>(5);
        mtv.setEnabled(false);
        mgreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mgreen.isChecked())
                    mresult.add("GREEN");
                else
                    mresult.remove("GREEN");

            }
        });
        myellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(myellow.isChecked())
                    mresult.add("YELLOW");
                else
                    mresult.remove("YELLOW");

            }
        });
        mblack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mblack.isChecked())
                    mresult.add("BLACK");
                else
                    mresult.remove("BLACK");

            }
        });
        mred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mred.isChecked())
                    mresult.add("RED");
                else
                    mresult.remove("RED");

            }
        });
        mblue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mblue.isChecked())
                    mresult.add("BLUE");
                else
                    mresult.remove("BLUE");

            }
        });
        mbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder sb= new StringBuilder();
                for(String s:mresult)
                    sb.append(s).append("\n");
                mtv.setText(sb.toString());
                mtv.setEnabled(false);
            }
        });
    }
}
