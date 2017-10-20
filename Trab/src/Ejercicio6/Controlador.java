package Ejercicio6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Controlador implements ActionListener, MouseListener {

    Vista v;

    public Controlador() {
        v = new Vista();
        v.setVisible(true);
        v.btnEsquina.addActionListener(this);
        v.btnCentro.addActionListener(this);
        v.btnAgrandar.addActionListener(this);
        v.btnAchicar.addActionListener(this);
        v.btnEsquina.addMouseListener(this);
        v.btnCentro.addMouseListener(this);
        v.btnAgrandar.addMouseListener(this);
        v.btnAchicar.addMouseListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (v.btnEsquina == ae.getSource()) {
            v.etiNombre.setLocation(20, 20);
        }
        if (v.btnCentro == ae.getSource()) {
            v.etiNombre.setLocation(250, 250);
        }
        if (v.btnAgrandar == ae.getSource()) {
            v.etiNombre.setSize(200, 60);
        }
        if (v.btnAchicar == ae.getSource()) {
            v.etiNombre.setSize(50, 15);

        }

    }

    @Override
    public void mouseClicked(MouseEvent me) {

    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {

        v.btnEsquina.setSize(260, 60);

        v.btnCentro.setSize(260, 60);

        v.btnAgrandar.setSize(260, 60);

        v.btnAchicar.setSize(260, 60);

    }

    @Override
    public void mouseExited(MouseEvent me) {

        v.btnEsquina.setSize(130, 30);

        v.btnCentro.setSize(130, 30);

        v.btnAgrandar.setSize(130, 30);

        v.btnAchicar.setSize(130, 30);

    }

    public static void main(String[] args) {
        Controlador c = new Controlador();
    }

}
