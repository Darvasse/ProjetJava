package com.example.projetjava.mvc1;

import android.view.View;

import com.example.projetjava.R;

public class Panel1_Ctrl implements View.OnClickListener {
    /*public PnlManager refPnlManager;*/

    @Override
    public void onClick(View view) {
        if(view.getId()== R.id.btnGotoPnl2){
            /*refPnlManager.setPnl(2);*/
        }
    }
}
