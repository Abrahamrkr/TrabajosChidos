package Ejercicio7;

import javax.swing.*;
import java.awt.Color;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;
import javax.swing.border.LineBorder;

public class Vista extends JFrame {

    JLabel etiTexto;
    JButton btnRojo, btnVerde, btnAzul, btnFondoR,btnFondoV,btnFondoA,btnOpaco,btnTrans;

    public Vista() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("EXAMEN 7");
        this.setSize(400, 600);
        this.getContentPane().setLayout(new AbsoluteLayout());
        etiTexto = new JLabel("Friendzone");
        this.getContentPane().add(etiTexto, new AbsoluteConstraints(10, 10, 100, 30));
        btnRojo = new JButton("Rojo");
        this.getContentPane().add(btnRojo, new AbsoluteConstraints(10, 100, 100, 30));
        btnFondoR = new JButton("Fondo_Rojo");
        this.getContentPane().add(btnFondoR, new AbsoluteConstraints(10, 150, 100, 30));
        btnVerde = new JButton("Verde");
        this.getContentPane().add(btnVerde, new AbsoluteConstraints(10, 200, 100, 30));
        btnFondoV = new JButton("Fondo_Verde");
        this.getContentPane().add(btnFondoV, new AbsoluteConstraints(10, 250, 100, 30));
        btnAzul = new JButton("Azul");
        this.getContentPane().add(btnAzul, new AbsoluteConstraints(10, 300, 100, 30));
        btnFondoA = new JButton("Fondo_Azul");
        this.getContentPane().add(btnFondoA, new AbsoluteConstraints(10, 350, 100, 30));
        btnTrans = new JButton("Transparente");
        this.getContentPane().add(btnTrans, new AbsoluteConstraints(10, 400, 100, 30));
        btnOpaco = new JButton("Opaco");
        this.getContentPane().add(btnOpaco, new AbsoluteConstraints(10, 450, 100, 30));


    }
}