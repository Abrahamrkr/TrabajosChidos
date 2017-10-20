package Ejercicio13;

import java.awt.Color;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class Vista extends JFrame {

    JTextField txtPal1, txtPal2;
    JLabel etiTexto;
    JButton btnConcatena;

    public Vista() {
        this.setTitle("");
        this.setSize(200, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new AbsoluteLayout());
        this.setResizable(true);
        this.setResizable(false);

        txtPal1 = new JTextField();
        this.getContentPane().add(txtPal1, new AbsoluteConstraints(20, 40, 100, 20));
        txtPal2 = new JTextField();
        this.getContentPane().add(txtPal2, new AbsoluteConstraints(20, 80, 100, 20));
        etiTexto= new JLabel();
        this.getContentPane().add(etiTexto, new AbsoluteConstraints(20, 120, 100, 20));
        btnConcatena = new JButton("Concatena");
        btnConcatena.setBorder(new LineBorder(Color.black, 3, true));
        btnConcatena.setForeground(Color.white);
        btnConcatena.setOpaque(true);
        btnConcatena.setBackground(Color.pink);
        this.getContentPane().add(btnConcatena, new AbsoluteConstraints(20, 150, 100, 30));

    }
    public static void main(String[] amoCECYTEM) {
        Vista v = new Vista();
        v.setVisible(true);
    }
}
