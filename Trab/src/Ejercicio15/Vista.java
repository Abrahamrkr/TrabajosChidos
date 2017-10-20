package Ejercicio15;


import java.awt.Color;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class Vista extends JFrame {

    
       JLabel eti1,eti2,eti3,eti4,eti5,eti6;
       JTextField txt1,txt2,txt3;
       JButton btn;
    public Vista() {
        this.setTitle("Ejercicio 15");
        this.setSize(300, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new AbsoluteLayout());
        this.setResizable(true);
        this.setResizable(false);

        eti1 = new JLabel("ax2+bx+c=0");
        this.getContentPane().add(eti1, new AbsoluteConstraints(75, 20, 200, 50));
        eti1.setFont(new java.awt.Font("Tahoma", 0, 20)); 
        eti2 = new JLabel("a: ");
        this.getContentPane().add(eti2, new AbsoluteConstraints(20, 70, 20, 20));
        txt1 = new JTextField();
        this.getContentPane().add(txt1, new AbsoluteConstraints(40, 70, 50, 30));
        eti3 = new JLabel("b: ");
        this.getContentPane().add(eti3, new AbsoluteConstraints(90, 70, 20, 20));
        txt2 = new JTextField();
        this.getContentPane().add(txt2, new AbsoluteConstraints(110, 70, 50, 30));
        eti4 = new JLabel("c: ");
        this.getContentPane().add(eti4, new AbsoluteConstraints(160, 70, 20, 20));
        txt3 = new JTextField();
        this.getContentPane().add(txt3, new AbsoluteConstraints(180, 70, 50, 30));
        eti5 = new JLabel();
        eti5.setBorder(new LineBorder(Color.pink, 3, true));
        this.getContentPane().add(eti5, new AbsoluteConstraints(20, 150, 200, 30));
        eti6 = new JLabel();
        eti6.setBorder(new LineBorder(Color.pink, 3, true));
        this.getContentPane().add(eti6, new AbsoluteConstraints(20, 200, 200, 30));
        btn=new JButton("Calcular");
        this.getContentPane().add(btn, new AbsoluteConstraints(20, 250, 200, 30));
        

        

    }

    public static void main(String[] amoCECYTEM) {
        Vista v = new Vista();
        v.setVisible(true);
    }
}
