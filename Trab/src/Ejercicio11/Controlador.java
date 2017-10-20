package Ejercicio11;

import java.awt.event.*;

public class Controlador implements ActionListener {

    Vista v;
    double a, b;

    public Controlador() {
        v = new Vista();
        v.setVisible(true);
        v.cal.addActionListener(this);

    }

    public static void main(String[] args) {
        Controlador c = new Controlador();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(v.cal==ae.getSource())
        a = Double.parseDouble(v.txtN.getText());
        b = Double.parseDouble(v.txtE.getText());
        double p = Math.pow(a, b);
        v.etiR.setText("Resultado: " + p);
    }

}
