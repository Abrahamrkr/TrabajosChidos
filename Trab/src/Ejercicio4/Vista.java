package Ejercicio4;

import java.awt.Color;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.*;

public class Vista extends JFrame {

    JTextField txtNombre, txtCiudad;
    JLabel etiFrase;
    JButton btnAceptar, btnDesactivar, btnActivar;
    

    public Vista() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("EJERCICIO 4");
        this.setSize(380,450);
        this.getContentPane().setLayout(new AbsoluteLayout());
        txtNombre = new JTextField();
        this.getContentPane().add(txtNombre, new AbsoluteConstraints(10, 20, 110, 60));
        txtNombre.setBorder(new LineBorder(Color.PINK, 3, true));
        txtCiudad = new JTextField();
        this.getContentPane().add(txtCiudad, new AbsoluteConstraints(10, 150, 110, 60));
        txtCiudad.setBorder(new LineBorder(Color.PINK, 3, true));
        etiFrase = new JLabel();
        this.getContentPane().add(etiFrase, new AbsoluteConstraints(10, 270, 350, 70));
        etiFrase.setBackground(Color.PINK);
        etiFrase.setOpaque(true);
        btnAceptar = new JButton("ACEPTAR");
        this.getContentPane().add(btnAceptar, new AbsoluteConstraints(190, 20, 90, 60));
        btnAceptar.setBackground(Color.PINK);
        btnAceptar.setOpaque(true); 
        btnDesactivar = new JButton("DESACTIVAR");
        this.getContentPane().add(btnDesactivar, new AbsoluteConstraints(190, 100, 90, 60));
        btnDesactivar.setBackground(Color.PINK);
        btnDesactivar.setOpaque(true); 
        btnActivar = new JButton("ACTIVAR");
        this.getContentPane().add(btnActivar, new AbsoluteConstraints(190, 180, 90, 60));
        btnActivar.setBackground(Color.PINK);
        btnActivar.setOpaque(true); 
    }
}




