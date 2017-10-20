package Ejercicio14;

import Ejercicio14.Vista;
import java.awt.Color;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class Vista extends JFrame {

    JLabel etiUno, etiDos, etiTres, etiCuatro, etiCinco, etiSeis, etiSiete, etiOcho, etiNueve;
    JTextField txtNumero;
    JButton btnBorrar;

    public Vista() {
        this.setTitle("Ejercicio 7");
        this.setSize(300, 250);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new AbsoluteLayout());
        this.setResizable(true);
        this.setResizable(false);

        etiUno = new JLabel("1");
        this.getContentPane().add(etiUno, new AbsoluteConstraints(20, 100, 10, 10));
        etiDos = new JLabel("2");
        this.getContentPane().add(etiDos, new AbsoluteConstraints(40, 100, 10, 10));
        etiTres = new JLabel("3");
        this.getContentPane().add(etiTres, new AbsoluteConstraints(60, 100, 10, 10));
        etiCuatro = new JLabel("4");
        this.getContentPane().add(etiCuatro, new AbsoluteConstraints(80, 100, 10, 10));
        etiCinco = new JLabel("5");
        this.getContentPane().add(etiCinco, new AbsoluteConstraints(100, 100, 10, 10));
        etiSeis = new JLabel("6");
        this.getContentPane().add(etiSeis, new AbsoluteConstraints(120, 100, 10, 10));
        etiSiete = new JLabel("7");
        this.getContentPane().add(etiSiete, new AbsoluteConstraints(140, 100, 10, 10));
        etiOcho = new JLabel("8");
        this.getContentPane().add(etiOcho, new AbsoluteConstraints(160, 100, 10, 10));
        etiNueve = new JLabel("9");
        this.getContentPane().add(etiNueve, new AbsoluteConstraints(180, 100, 10, 10));
        txtNumero = new JTextField();
        this.getContentPane().add(txtNumero, new AbsoluteConstraints(10, 20, 210, 20));
        btnBorrar = new JButton("Borrar");
        btnBorrar.setBorder(new LineBorder(Color.black, 3, true));
        btnBorrar.setForeground(Color.white);
        btnBorrar.setOpaque(true);
        btnBorrar.setBackground(Color.pink);
        this.getContentPane().add(btnBorrar, new AbsoluteConstraints(10, 150, 100, 50));

    }

    public static void main(String[] amoCECYTEM) {
        Vista v = new Vista();
        v.setVisible(true);
    }
}
