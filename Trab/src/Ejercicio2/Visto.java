package Ejercicio2;

import java.awt.Color;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import org.netbeans.lib.awtextra.*;

public class Visto extends JFrame {
    JButton btnTraspasa1,btnTraspasa2;
    JLabel etiTexto1, etiTexto2;
    JTextField txtTexto;
    
    public Visto () {
        this.setTitle("Traspasa");
        this.setSize(500, 250);
        this.getContentPane().setLayout(new AbsoluteLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        txtTexto = new JTextField();
        this.getContentPane().add(txtTexto, new AbsoluteConstraints(20, 110, 450, 20));
        btnTraspasa1 = new JButton("Traspasa1");
        this.getContentPane().add(btnTraspasa1, new AbsoluteConstraints(20, 80, 200, 20));
        btnTraspasa2 = new JButton("Traspasa2");
        this.getContentPane().add(btnTraspasa2, new AbsoluteConstraints(240, 80, 200, 20));
        etiTexto1 = new JLabel();
        this.getContentPane().add(etiTexto1, new AbsoluteConstraints(20, 20, 200, 30));
        etiTexto2 = new JLabel();
        this.getContentPane().add(etiTexto2, new AbsoluteConstraints(20, 50, 200, 30));
       
}
}