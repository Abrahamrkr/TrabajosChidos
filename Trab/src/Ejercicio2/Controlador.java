package Ejercicio2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener{

    Visto v;

    public Controlador() {
        v = new Visto();
        v.setVisible(true);
        v.btnTraspasa1.addActionListener(this);
        v.btnTraspasa2.addActionListener(this);
    }
     
    
    public static void main(String[] args) {
        Controlador c=new Controlador();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource()==v.btnTraspasa1){
           v.etiTexto1.setText(v.txtTexto.getText());
           
       } 
       if(ae.getSource()==v.btnTraspasa2){
           v.etiTexto2.setText(v.txtTexto.getText());
       } 
    } 
}