package Ejercicio9;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.event.*;

public class Controlador implements ActionListener {

    Vista v;
    double a, b, c;

    public Controlador() {
        v = new Vista();
        v.setVisible(true);
        v.btnCal.addActionListener(this);

    }

    public static void main(String[] args) {
        Controlador c = new Controlador();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
         a = Double.parseDouble(v.txtPP.getText());
        b = Double.parseDouble(v.txtSP.getText());
        c = Double.parseDouble(v.txtTP.getText());
        double p = ((a + b + c) / 3);
        v.etiNF.setText("Promedio:  " + p);
        if (p > 5) {
            v.etiRes.setText("APROBADO");
            v.etiRes.setBackground(Color.green);
            v.etiRes.setOpaque(true);
        } else {
            v.etiRes.setText("SUSPENSO");
            v.etiRes.setBackground(Color.RED);
            v.etiRes.setOpaque(true);
        }
        }
    }


