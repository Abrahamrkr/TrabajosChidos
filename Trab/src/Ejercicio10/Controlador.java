package Ejercicio10;

import java.awt.event.*;

public class Controlador implements ActionListener {

    Vista v;
    double a;

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
        a = Double.parseDouble(v.txtRad.getText());
        double area = (Math.PI * (a * a));
        double per = (Math.PI * (2 * a));
        v.etiA.setText("" + area);
        v.etiP.setText("" + per);
    }

}
