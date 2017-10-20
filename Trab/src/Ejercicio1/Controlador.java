package Ejercicio1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener{

    Vista v;

    public Controlador() {
        v = new Vista();
        v.setVisible(true);
        v.btnOCiudad.addActionListener(this);
        v.btnMCiudad.addActionListener(this);
        v.btnONombre.addActionListener(this);
        v.btnMNombre.addActionListener(this);

    }
     
    
    public static void main(String[] args) {
        Controlador c=new Controlador();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource()==v.btnOCiudad){
           v.etiCiudad.setVisible(false);
       } 
       if(ae.getSource()==v.btnMCiudad){
           v.etiCiudad.setVisible(true);
       } 
       if(ae.getSource()==v.btnONombre){
           v.etiNombre.setVisible(false);
       } 
       if(ae.getSource()==v.btnMNombre){
           v.etiNombre.setVisible(true);
       } 
    } 
}
