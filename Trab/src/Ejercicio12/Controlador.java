package Ejercicio12;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Controlador implements  ActionListener{

    Vista v;
    Double num;

    public Controlador() {
        v = new Vista();
        v.setVisible(true);
        v.btn.addActionListener(this);
        
        
    }


    public static void main(String[] args) {
        Controlador c = new Controlador();
    }


    @Override
    public void actionPerformed(ActionEvent ae) {
        if(v.btn==ae.getSource()){
        num = Double.parseDouble(v.txtNumero.getText());
        double R=Math.sqrt(num);
        v.etiRaiz.setText("" + R);
        }
        
    }
}
