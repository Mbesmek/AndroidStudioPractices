package com.example.gridlayoutprogramatik;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.GridLayout;

public class MainActivity extends AppCompatActivity {

    private GridLayout pnl;
    private Button btn;
    public void init(){
        pnl=new GridLayout(this);
        pnl.setOrientation(GridLayout.VERTICAL); //GridLayout default = HORIZONTAL
        pnl.setRowCount(5);

        for(int i=1;i<16;i++){
            btn= new Button(this);
            btn.setText("Button"+i);
            if (i==5){
                GridLayout.LayoutParams params= new GridLayout.LayoutParams();
                params.columnSpec= GridLayout.spec(0,3);
                params.setGravity(Gravity.FILL_HORIZONTAL);
                btn.setLayoutParams(params);
            }
            else if(i==6){
                GridLayout.LayoutParams params= new GridLayout.LayoutParams();
                params.rowSpec=GridLayout.spec(0,2);
                params.setGravity(Gravity.FILL_VERTICAL);
                btn.setLayoutParams(params);
            }
            pnl.addView(btn);
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        setContentView(pnl);
    }
}