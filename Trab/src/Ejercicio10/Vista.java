
package Ejercicio10;

import java.awt.Color;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.*;

public class Vista extends JFrame {

    JTextField txtRad;
    JLabel etiA,etiP;
    JButton cal;
    
    

    public Vista() {
        this.setTitle("Radio_Perimetro");
        this.setSize(170, 200);
        this.getContentPane().setLayout(new AbsoluteLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        txtRad=new JTextField();
        this.getContentPane().add(txtRad,new AbsoluteConstraints(20,20,100,25));
        etiA=new JLabel();
        this.getContentPane().add(etiA,new AbsoluteConstraints(20,50,100,25));
        etiA.setBorder(new LineBorder(Color.pink, 3, true));
        this.getContentPane().add(etiA, new AbsoluteConstraints(20, 50, 100, 25));
        etiP=new JLabel();
        this.getContentPane().add(etiP,new AbsoluteConstraints(20,80,100,25));
        etiP.setBorder(new LineBorder(Color.pink, 3, true));
        this.getContentPane().add(etiP, new AbsoluteConstraints(20, 80, 100, 25));
        
    }
    public static void main(String[] args) {
        Vista v=new Vista();
        v.setVisible(true);
    }
}