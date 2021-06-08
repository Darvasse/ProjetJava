package com.example.projetjava.mvc1;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.projetjava.R;

public class Panel1_View extends LinearLayout {
    public Panel1_Ctrl refCtrl;
    public Button btnGotoPnl2FromPnl1;
    public Button btnGotoPnl3FromPnl1;

    public Panel1_View(Context context) {
        super(context);
            LayoutInflater inflater= ((Activity)context).getLayoutInflater();
            inflater.inflate(R.layout.layout_panel1,this);

            btnGotoPnl2FromPnl1=(Button)findViewById(R.id.btnGotoPnl2FromPnl1);
            btnGotoPnl3FromPnl1=(Button)findViewById(R.id.btnGotoPnl3FromPnl1);
    }

    public void setRefCtrl(Panel1_Ctrl c){
        refCtrl=c;
        btnGotoPnl3FromPnl1.setOnClickListener(refCtrl);
        btnGotoPnl2FromPnl1.setOnClickListener(refCtrl);
    }
}
