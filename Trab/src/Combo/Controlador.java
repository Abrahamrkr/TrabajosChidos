package Combo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {

    Vista v;

    public Controlador() {
        v = new Vista(); 
        v.setVisible(true);
        v.combo.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String mensaje = "El color elegido es ";
        mensaje = mensaje + v.combo.getSelectedItem().toString();
        v.etiResultado.setText(mensaje);
    }

    public static void main(String[] args) {
        Controlador c=new Controlador();
        
    }
}