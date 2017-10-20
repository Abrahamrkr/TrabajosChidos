package Ejercicio15;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controlador implements ActionListener{

    Vista v;
    double a,b,c;
    public Controlador() {
        v = new Vista();
        v.setVisible(true);
        v.btn.addActionListener(this);
       
    }

    
    

    public static void main(String[] args) {
        Controlador v = new Controlador();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(v.btn==ae.getSource()){
              a = Double.parseDouble(v.txt1.getText());
              b = Double.parseDouble(v.txt2.getText());
              c = Double.parseDouble(v.txt3.getText());
              double raiz= (double) ((b * b) -((4*a)*c));
              double raiz1=(double)  Math.sqrt(raiz);
              double op=(double) 2*a;
              if(raiz1<0){
                  v.eti5.setText("No hay solucion");
                  v.eti6.setText("No hay solucion");
                  v.eti5.setBackground(Color.red);
                  v.eti6.setBackground(Color.red);
                  v.eti5.setOpaque(true);
                  v.eti5.setOpaque(true);
              }
              if(raiz1==0){
                 double x1=(double) -(b)/op;
                 v.eti5.setText("Hay una Solucion");
                 v.eti5.setBackground(Color.green);
                 v.eti6.setText("" + x1);
              }
              if(raiz1>0){
                  double x2=(double) (-(b) + raiz1)/op;
                  double x3=(double) (-(b) - raiz1)/op;
                  v.eti5.setText("" + x2);
                  v.eti6.setText("" + x3);
              }
              
        }
    }

    
}
