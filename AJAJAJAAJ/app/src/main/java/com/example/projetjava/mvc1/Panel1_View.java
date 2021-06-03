package com.example.projetjava.mvc1;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.projetjava.R;

public class Panel1_View extends LinearLayout {
    public Panel1_Ctrl refCtrl;
    public Button btnGoToPnl2;


    public Panel1_View(Context context) {
        super(context);
            LayoutInflater inflater= ((Activity)context).getLayoutInflater();
            inflater.inflate(R.layout.layout_panl1,this);

            btnGoToPnl2=(Button)findViewById(R.id.btnGotoPnl2);
    }

    public void setRefCtrl(Panel1_Ctrl c){
        refCtrl=c;
        btnGoToPnl2.setOnClickListener(refCtrl);
    }
}
