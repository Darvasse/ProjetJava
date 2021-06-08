package com.example.projetjava.mvc1;

import android.view.View;

import com.example.projetjava.PnlManager;
import com.example.projetjava.R;

public class Panel1_Ctrl implements View.OnClickListener {
    public PnlManager refPnlManager;

    @Override
    public void onClick(View view) {
        if(view.getId()== R.id.btnGotoPnl2FromPnl1){
            refPnlManager.setPnl(2);
        }
        if(view.getId()==R.id.btnGotoPnl3FromPnl1){
            refPnlManager.setPnl(3);
        }
    }
}
