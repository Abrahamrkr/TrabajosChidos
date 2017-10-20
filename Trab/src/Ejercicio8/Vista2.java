package Ejercicio8;

import java.awt.Color;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import org.netbeans.lib.awtextra.*;

public class Vista2 extends JFrame {

    JTextField txtUnidades, txtPrecio;
    JLabel etiTotSinIva, etiIva, etiTotMasIva;
    JButton btnCalcular;

    public Vista2() {
        this.setTitle("Calculos");
        this.setSize(170, 250);
        this.getContentPane().setLayout(new AbsoluteLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        txtUnidades = new JTextField();
        this.getContentPane().add(txtUnidades, new AbsoluteConstraints(20, 20, 100, 20));
        txtPrecio = new JTextField();
        this.getContentPane().add(txtPrecio, new AbsoluteConstraints(20, 50, 100, 20));
        etiTotSinIva = new JLabel();
        this.getContentPane().add(etiTotSinIva, new AbsoluteConstraints(20, 80, 100, 20));
        etiTotSinIva.setBorder(new LineBorder(Color.pink, 3, true));
        this.getContentPane().add(etiTotSinIva, new AbsoluteConstraints(20, 80, 100, 20));
        etiIva= new JLabel();
        this.getContentPane().add(etiIva, new AbsoluteConstraints(20, 110, 100, 20));
        etiIva.setBorder(new LineBorder(Color.pink, 3, true));
        this.getContentPane().add(etiIva, new AbsoluteConstraints(20, 110, 100, 20));
        etiTotMasIva = new JLabel();
        this.getContentPane().add(etiTotMasIva, new AbsoluteConstraints(20, 140, 100, 20));
        etiTotMasIva.setBorder(new LineBorder(Color.pink, 3, true));
        this.getContentPane().add(etiTotMasIva, new AbsoluteConstraints(20, 140, 100, 20));
        btnCalcular = new JButton("Calcular");
        this.getContentPane().add(btnCalcular, new AbsoluteConstraints(20, 170, 100, 20));

    }

    public static void main(String[] args) {
        Vista2 v= new Vista2();
        v.setVisible(true);
    }

}
