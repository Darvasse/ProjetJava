package com.example.projetjava.mvc3;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.projetjava.R;
import com.example.projetjava.mvc2.Panel2_Ctrl;

public class Panel3_View extends LinearLayout {
    public Panel3_Ctrl refCtrl;
    public Button btnGotoPnl1;
    public Button btnGotoPnl2;
    public Panel3_View(Context context) {
        super(context);
        LayoutInflater inflater =((Activity)context).getLayoutInflater();
        inflater.inflate(R.layout.layout_panel3,this);

        btnGotoPnl1=(Button)findViewById(R.id.btnGotoPnl1FromPnl3);
        btnGotoPnl2 = (Button)findViewById(R.id.btnGotoPnl2FromPnl3);
    }
    public void setRefCtrl(Panel3_Ctrl c){
        refCtrl= c;
        btnGotoPnl1.setOnClickListener(refCtrl);
        btnGotoPnl2.setOnClickListener(refCtrl);
    }
}
