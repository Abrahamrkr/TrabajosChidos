package Ejercicio7;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Controlador implements ActionListener {

    Vista v;

    public Controlador() {
        v = new Vista();
        v.setVisible(true);
        v.btnAzul.addActionListener(this);
        v.btnFondoA.addActionListener(this);
        v.btnFondoR.addActionListener(this);
        v.btnFondoV.addActionListener(this);
        v.btnOpaco.addActionListener(this);
        v.btnRojo.addActionListener(this);
        v.btnTrans.addActionListener(this);
        v.btnVerde.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (v.btnAzul==ae.getSource()) {
            v.etiTexto.setForeground(Color.BLUE);
            v.etiTexto.setOpaque(true);
        }
        if (v.btnFondoA==ae.getSource()) {
            v.etiTexto.setBackground(Color.BLUE);
            v.etiTexto.setOpaque(true);
        }
        if (v.btnRojo==ae.getSource()) {
            v.etiTexto.setForeground(Color.RED);
            v.etiTexto.setOpaque(true);
        }
        if (v.btnFondoR==ae.getSource()) {
            v.etiTexto.setBackground(Color.RED);
            v.etiTexto.setOpaque(true);
        }
        if (v.btnVerde==ae.getSource()) {
            v.etiTexto.setForeground(Color.GREEN);
            v.etiTexto.setOpaque(true);
        }
        if (v.btnFondoV==ae.getSource()) {
            v.etiTexto.setBackground(Color.GREEN);
            v.etiTexto.setOpaque(true);
        }
        if (v.btnTrans==ae.getSource()) {
            v.etiTexto.setOpaque(false);
        }
        if (v.btnOpaco==ae.getSource()) {
            v.etiTexto.setOpaque(true);
        }

    }

    public static void main(String[] args) {
        Controlador c = new Controlador();
    }

}
