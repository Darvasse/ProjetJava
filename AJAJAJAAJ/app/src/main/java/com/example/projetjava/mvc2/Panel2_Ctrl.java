package com.example.projetjava.mvc2;

import android.view.View;

import com.example.projetjava.PnlManager;
import com.example.projetjava.R;

/*

 */
public class Panel2_Ctrl implements View.OnClickListener {
    public PnlManager refPnlManager;

    @Override
    public void onClick(View v) {
        if(v.getId()== R.id.btnGotoPnl1FromPnl2){
            refPnlManager.setPnl(1);
        }
        else if(v.getId()==R.id.btnGotoPnl3FromPnl2){
            refPnlManager.setPnl(3);
        }
    }
}
