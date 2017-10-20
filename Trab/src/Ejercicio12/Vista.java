package Ejercicio12;

import java.awt.Color;

import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class Vista extends JFrame {

    JTextField txtNumero;
    JLabel etiRaiz;
    JButton btn;

    public Vista() {
        this.setTitle("Raiz");
        this.setSize(300, 200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new AbsoluteLayout());
        this.setResizable(true);
        this.setResizable(false);

        txtNumero = new JTextField();
        this.getContentPane().add(txtNumero, new AbsoluteConstraints(80, 40, 100, 20));
        etiRaiz = new JLabel();
        etiRaiz.setBorder(new LineBorder(Color.pink, 3, true));
        this.getContentPane().add(etiRaiz, new AbsoluteConstraints(80, 80, 100, 20));
        btn=new JButton("Calcular");
        this.getContentPane().add(btn, new AbsoluteConstraints(80, 120, 100, 20));
        
    }
    public static void main(String[] args) {
        Vista v=new Vista();
        v.setVisible(true);
    }
}
