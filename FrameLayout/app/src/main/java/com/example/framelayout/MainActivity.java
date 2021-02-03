package com.example.framelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView img1,img2;
    Button btnChange;
    public void init(){
        img1 = (ImageView) findViewById(R.id.img1);
        img2=(ImageView)findViewById(R.id.img2);
        btnChange=(Button) findViewById(R.id.btnChange);
    }
    public void changePhoto(){
        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(img2.getVisibility()== View.INVISIBLE)
                    img2.setVisibility(View.VISIBLE);
                else
                    img2.setVisibility(View.INVISIBLE);
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        changePhoto();
    }
}