package com.example.projetjava.mvc2;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.projetjava.R;

public class Panel2_View extends LinearLayout {
    public Panel2_Ctrl refCtrl;
    public Button btnGotoPnl1FromPnl2;
    public Button btnGotoPnl3FromPnl2;

    public Panel2_View(Context context) {
        super(context);
        LayoutInflater inflater=((Activity)context).getLayoutInflater();
        inflater.inflate(R.layout.layout_panel2,this);

        btnGotoPnl1FromPnl2=(Button)findViewById(R.id.btnGotoPnl1FromPnl2);
        btnGotoPnl3FromPnl2 = (Button)findViewById(R.id.btnGotoPnl3FromPnl2);
    }
    public void setRefCtrl(Panel2_Ctrl c){
        refCtrl=c;
        btnGotoPnl1FromPnl2.setOnClickListener(refCtrl);
        btnGotoPnl3FromPnl2.setOnClickListener(refCtrl);
    }

}
