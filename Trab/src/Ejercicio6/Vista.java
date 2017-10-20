package Ejercicio6;

import javax.swing.*;
import java.awt.Color;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;
import javax.swing.border.LineBorder;

public class Vista extends JFrame {

    JLabel etiNombre;
    JButton btnEsquina, btnCentro, btnAgrandar, btnAchicar;

    public Vista() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("EXAMEN 6");
        this.setSize(500, 500);
        this.getContentPane().setLayout(new AbsoluteLayout());
        etiNombre = new JLabel("SuNombre:v");
        this.getContentPane().add(etiNombre, new AbsoluteConstraints(10, 10, 100, 30));
        etiNombre.setBackground(Color.PINK);
        etiNombre.setOpaque(true);

        btnEsquina = new JButton("ESQUINA");
        this.getContentPane().add(btnEsquina, new AbsoluteConstraints(10, 130, 130, 30));
        btnEsquina.setBorder(new LineBorder(Color.PINK, 3, true));
        btnCentro = new JButton("CENTRO");
        this.getContentPane().add(btnCentro, new AbsoluteConstraints(10, 230, 130, 30));
        btnCentro.setBorder(new LineBorder(Color.PINK, 3, true));
        btnAgrandar = new JButton("AGRANDAR");
        this.getContentPane().add(btnAgrandar, new AbsoluteConstraints(10, 330, 130, 30));
        btnAgrandar.setBorder(new LineBorder(Color.PINK, 2, true));
        btnAchicar = new JButton("ACHICAR");
        this.getContentPane().add(btnAchicar, new AbsoluteConstraints(10, 430, 130, 30));
        btnAchicar.setBorder(new LineBorder(Color.PINK, 3, true));

    }

}
