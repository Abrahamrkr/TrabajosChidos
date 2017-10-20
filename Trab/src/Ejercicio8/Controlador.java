package Ejercicio8;

import java.awt.event.*;
;

public class Controlador implements  ActionListener{
    Vista2 v;
    double a, b;
    public Controlador() {
        v = new Vista2();
        v.setVisible(true);
        v.btnCalcular.addActionListener(this);
        
    }
    public static void main(String[] args) {
        Controlador v = new Controlador();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
         a = Double.parseDouble(v.txtPrecio.getText());
        b = Double.parseDouble(v.txtUnidades.getText());
        double total = (a * b);
        double iva = (total * .16);
        double totaliva = (total + iva);
        v.etiTotSinIva.setText("SIN: " + total);
        v.etiIva.setText("IVA: " + iva);
        v.etiTotMasIva.setText("CON: " + totaliva);
    }


}
