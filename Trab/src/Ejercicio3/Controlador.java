package Ejercicio3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controlador implements ActionListener,KeyListener{

    Vista v;

    public Controlador() {
        v = new Vista();
        v.setVisible(true);
        v.btnVaciar.addActionListener(this);
        v.txtTexto.addKeyListener(this);
    }
     
    
    public static void main(String[] args) {
        Controlador c=new Controlador();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource()==v.btnVaciar){
           v.etiTexto.setText("");
           v.txtTexto.setText("");
           
       } 
    } 

    @Override
    public void keyTyped(KeyEvent ke) {
        
    }

    @Override
    public void keyPressed(KeyEvent ke) {
     v.etiTexto.setText(v.txtTexto.getText());   
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        
    }
}