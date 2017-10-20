package Pares_Impares;

import java.awt.Color;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.*;

public class Vista extends JFrame {

    JComboBox combo;
    JLabel etiResultado;
    JButton btnPares, btnImpares;

    public Vista() {
        this.setTitle("Pares_Impares");
        this.setSize(500, 250);
        this.getContentPane().setLayout(new AbsoluteLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        combo = new JComboBox();
        this.getContentPane().add(combo, new AbsoluteConstraints(10, 30, 100, 30));
        etiResultado = new JLabel();
        this.getContentPane().add(etiResultado, new AbsoluteConstraints(10, 130, 450, 30));
        etiResultado.setBorder(new LineBorder(Color.black, 5, true));
        this.getContentPane().add(etiResultado, new AbsoluteConstraints(10, 130, 450, 30));
        btnPares=new JButton("PARES");
        this.getContentPane().add(btnPares, new AbsoluteConstraints(120, 30, 100, 20));
        btnImpares=new JButton("IMPARES");
        this.getContentPane().add(btnImpares, new AbsoluteConstraints(220, 30, 100, 20));

    }
}