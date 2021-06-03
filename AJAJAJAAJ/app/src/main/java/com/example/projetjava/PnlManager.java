package com.example.projetjava;

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
}
