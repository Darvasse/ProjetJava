package com.example.projetjava;

import android.app.Activity;
import android.content.Context;

import com.example.projetjava.mvc1.Panel1_Ctrl;
import com.example.projetjava.mvc1.Panel1_Mdl;
import com.example.projetjava.mvc1.Panel1_View;
import com.example.projetjava.mvc2.Panel2_Ctrl;
import com.example.projetjava.mvc2.Panel2_Mdl;
import com.example.projetjava.mvc2.Panel2_View;
import com.example.projetjava.mvc3.Panel3_Ctrl;
import com.example.projetjava.mvc3.Panel3_Mdl;
import com.example.projetjava.mvc3.Panel3_View;

public class PnlManager {
    private static PnlManager instance=null;
    private int pnl;
    private Panel1_View view1;
    private Panel2_View view2;
    private Panel3_View view3;
    private Panel1_Ctrl ctrl1;
    private Panel2_Ctrl ctrl2;
    private Panel3_Ctrl ctrl3;
    private Panel1_Mdl mdl1;
    private Panel2_Mdl mdl2;
    private Panel3_Mdl mdl3;

    public Activity refAct;

    private  PnlManager(Context context){
        pnl=-1;
        ctrl1 = new Panel1_Ctrl();
        ctrl2 = new Panel2_Ctrl();
        ctrl3 = new Panel3_Ctrl();
        mdl1 = new Panel1_Mdl();
        mdl2 = new Panel2_Mdl();
        mdl3 = new Panel3_Mdl();
        view1 = new Panel1_View(context);
        view2 = new Panel2_View(context);
        view3 = new Panel3_View(context);
        
    }
}
