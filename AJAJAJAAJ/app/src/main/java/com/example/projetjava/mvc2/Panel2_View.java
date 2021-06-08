package com.example.projetjava.mvc2;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.projetjava.R;

public class Panel2_View extends LinearLayout {
    public Panel2_Ctrl refCtrl;
    public Button btnGotoPnl3;

    public Panel2_View(Context context) {
        super(context);
        LayoutInflater inflater=((Activity)context).getLayoutInflater();
        inflater.inflate(R.layout.layout_panel2,this);
        btnGotoPnl3 = (Button)findViewById(R.id.btnGotoPnl3FromPnl1);
    }

}
