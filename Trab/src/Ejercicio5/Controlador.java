package Ejercicio5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Controlador implements ActionListener, MouseListener{

    Vista v;

    public Controlador() {
        v = new Vista();
        v.setVisible(true);
        v.btnBotonsin.addMouseListener(this);
    }
     
    
    public static void main(String[] args) {
        Controlador c=new Controlador();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       
           
       
    } 

    @Override
    public void mouseClicked(MouseEvent me) {
        
    }

    @Override
    public void mousePressed(MouseEvent me) {
         v.btnBotonsin.setText("lo que sea");
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        v.etipal1.setText("");
        v.etipal2.setText("");
        v.etipal3.setText("");
        v.etipal4.setText("");
        
        v.btnBotonsin.setText("hola, amo a Abraham");
    }

    @Override
    public void mouseExited(MouseEvent me) {
         v.etipal1.setText("H");
        v.etipal2.setText("O");
        v.etipal3.setText("L");
        v.etipal4.setText("A");
        v.btnBotonsin.setText("ya no est+a en la friendzone");
    }
}