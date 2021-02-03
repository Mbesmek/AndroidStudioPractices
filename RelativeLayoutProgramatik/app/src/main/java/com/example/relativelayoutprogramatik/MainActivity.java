package com.example.relativelayoutprogramatik;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout pnlMain;
    private EditText txtName, txtSurname;
    private Button btnSend;
    private RelativeLayout.LayoutParams prmTxtName, prmTxtSurname, prmBtnSend;

    public void init(){
        pnlMain=new RelativeLayout(this);
        txtName =new EditText(this);
        txtName.setId(1);
        txtName.setHint("Adınızı Girin");
        prmTxtName =new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
        txtName.setLayoutParams(prmTxtName);


        txtSurname = new EditText(this);
        txtSurname.setId(2);
        txtSurname.setHint("Soyadınızı Girin");
        prmTxtSurname= new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
        prmTxtSurname.addRule(RelativeLayout.BELOW,txtName.getId());
        txtSurname.setLayoutParams(prmTxtSurname);

        btnSend= new Button(this);
        btnSend.setText(R.string.main_send);
        btnSend.setTextColor(Color.GREEN);
        btnSend.setBackgroundColor(ContextCompat.getColor(this,R.color.design_default_color_primary));
        prmBtnSend=new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
        prmBtnSend.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        btnSend.setLayoutParams(prmBtnSend);

        pnlMain.addView(txtName);
        pnlMain.addView(txtSurname);
        pnlMain.addView(btnSend);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
        setContentView(pnlMain);
    }
}