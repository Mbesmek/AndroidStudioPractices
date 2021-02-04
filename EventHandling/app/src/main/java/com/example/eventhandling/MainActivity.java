package com.example.eventhandling;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtMain;
    Button btn;
    int clickCount=0;

    private void init(){
        txtMain =(TextView) findViewById(R.id.txt);
        btn= (Button) findViewById(R.id.btn);

 /*   btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            clickCount++;                               Method 1
            txtMain.setText("Click Count: "+ clickCount);
        }
    });
*/

        btn.setOnClickListener(new clickHandler());


    }


/*    public void btn_click(View view){
        clickCount++;                       Method 2
        txtMain.setText("Click Count: "+ clickCount);
    }
 */

    public class clickHandler implements View.OnClickListener{
    @Override
    public void onClick(View v) {
        clickCount++;               // Method3 
        txtMain.setText("Click Count: "+ clickCount);
    }
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }
}