package Ejercicio14;

import Ejercicio14.Controlador;
import Ejercicio14.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Controlador implements ActionListener, MouseListener {

    Vista v;
    String n="";
    public Controlador() {
        v = new Vista();
        v.setVisible(true);
        v.btnBorrar.addActionListener(this);
        v.etiUno.addMouseListener(this);
        v.etiDos.addMouseListener(this);
        v.etiTres.addMouseListener(this);
        v.etiCuatro.addMouseListener(this);
        v.etiCinco.addMouseListener(this);
        v.etiSeis.addMouseListener(this);
        v.etiSiete.addMouseListener(this);
        v.etiOcho.addMouseListener(this);
        v.etiNueve.addMouseListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == v.btnBorrar) {
            v.txtNumero.setText("");
        }

    }

    public static void main(String[] args) {
        Controlador v = new Controlador();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == v.etiUno) {
            n+="1";
        }
        if (e.getSource() == v.etiDos) {
            n+="2";
        }
        if (e.getSource() == v.etiTres) {
            n+="3";
        }
        if (e.getSource() == v.etiCuatro) {
            n+="4";
        }
        if (e.getSource() == v.etiCinco) {
            n+="5";
        }
        if (e.getSource() == v.etiSeis) {
            n+="6";
        }
        if (e.getSource() == v.etiSiete) {
            n+="7";
        }
        if (e.getSource() == v.etiOcho) {
            n+="8";
        }
        if (e.getSource() == v.etiNueve) {
            n+="9";
        }
        v.txtNumero.setText(n);

    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
