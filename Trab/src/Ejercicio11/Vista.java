
package Ejercicio11;

import java.awt.Color;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.*;

public class Vista extends JFrame {

    JTextField txtN,txtE;
    JLabel etiR;
    JButton cal;
    
    

    public Vista() {
        this.setTitle("Expo");
        this.setSize(250, 250);
        this.getContentPane().setLayout(new AbsoluteLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        txtN=new JTextField();
        this.getContentPane().add(txtN,new AbsoluteConstraints(20,20,100,25));
        txtE=new JTextField();
        this.getContentPane().add(txtE,new AbsoluteConstraints(20,50,100,25));
        etiR=new JLabel();
        this.getContentPane().add(etiR,new AbsoluteConstraints(20,80,150,25));
        etiR.setBorder(new LineBorder(Color.pink, 3, true));
        this.getContentPane().add(etiR, new AbsoluteConstraints(20, 80, 150, 25));
        cal=new JButton("Calcular");
        this.getContentPane().add(cal, new AbsoluteConstraints(20, 110, 100, 25));
        
    }
    public static void main(String[] args) {
        Vista v=new Vista();
        v.setVisible(true);
    }
}