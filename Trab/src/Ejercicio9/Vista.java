
package Ejercicio9;

import java.awt.Color;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.*;

public class Vista extends JFrame {

    JTextField txtPP,txtSP,txtTP;
    JLabel etiNF,etiRes;
    JButton btnCal;
    

    public Vista() {
        this.setTitle("Parciales");
        this.setSize(170, 300);
        this.getContentPane().setLayout(new AbsoluteLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        txtPP=new JTextField();
        this.getContentPane().add(txtPP,new AbsoluteConstraints(20,20,100,25));
        txtSP=new JTextField();
        this.getContentPane().add(txtSP,new AbsoluteConstraints(20,50,100,25));
        txtTP=new JTextField();
        this.getContentPane().add(txtTP,new AbsoluteConstraints(20,80,100,25));
        etiNF=new JLabel();
        this.getContentPane().add(etiNF,new AbsoluteConstraints(20,110,100,25));
        etiNF.setBorder(new LineBorder(Color.pink, 3, true));
        this.getContentPane().add(etiNF, new AbsoluteConstraints(20, 110, 100, 25));
        etiRes=new JLabel();
        this.getContentPane().add(etiRes,new AbsoluteConstraints(20,140,100,25));
        etiRes.setBorder(new LineBorder(Color.pink, 3, true));
        this.getContentPane().add(etiRes, new AbsoluteConstraints(20, 140, 100, 25));
        btnCal=new JButton("Calcular");
        this.getContentPane().add(btnCal,new AbsoluteConstraints(20,200,100,25));
    }
    public static void main(String[] args) {
        Vista v=new Vista();
        v.setVisible(true);
    }
}