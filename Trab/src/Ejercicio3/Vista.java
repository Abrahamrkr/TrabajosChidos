package Ejercicio3;

import java.awt.Color;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import org.netbeans.lib.awtextra.*;

public class Vista extends JFrame {
    JButton btnVaciar;
    JLabel etiTexto;
    JTextField txtTexto;
    
    public Vista () {
        this.setTitle("Vaciar");
        this.setSize(500, 250);
        this.getContentPane().setLayout(new AbsoluteLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        txtTexto = new JTextField();
        this.getContentPane().add(txtTexto, new AbsoluteConstraints(20, 110, 450, 20));
        btnVaciar = new JButton("VACIAR");
        this.getContentPane().add(btnVaciar, new AbsoluteConstraints(20, 80, 200, 20));
        etiTexto = new JLabel();
        this.getContentPane().add(etiTexto, new AbsoluteConstraints(20, 20, 200, 30));
}
}