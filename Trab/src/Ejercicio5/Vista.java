package Ejercicio5;

import java.awt.Color;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import org.netbeans.lib.awtextra.*;

public class Vista extends JFrame {
    JButton btnBotonsin;
    JLabel etipal1,etipal2,etipal3,etipal4;
    
    public Vista () {
        this.setTitle("El Puntero Loko");
        this.setSize(500, 250);
        this.getContentPane().setLayout(new AbsoluteLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        btnBotonsin = new JButton("Botonsin");
        this.getContentPane().add(btnBotonsin, new AbsoluteConstraints(20, 150, 100, 50));
        etipal1 = new JLabel("H");
        this.getContentPane().add(etipal1, new AbsoluteConstraints(20, 20, 200, 30));
        etipal2 = new JLabel("O");
        this.getContentPane().add(etipal2, new AbsoluteConstraints(20, 50, 200, 30));
        etipal3 = new JLabel("L");
        this.getContentPane().add(etipal3, new AbsoluteConstraints(20, 80, 200, 30));
        etipal4 = new JLabel("A");
        this.getContentPane().add(etipal4, new AbsoluteConstraints(20, 110, 200, 30));
        
}
}