package botones;

import java.awt.Color;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import org.netbeans.lib.awtextra.*;

public class Vista extends JFrame {
    JButton btnAceptar;
    JLabel etiResultado;
    JRadioButton optRojo, optVerde, optAzul;
    JPanel panel;
    ButtonGroup grupo;
    
    public Vista () {
        this.setTitle("COLORES");
        this.setSize(500, 250);
        this.getContentPane().setLayout(new AbsoluteLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        optRojo = new JRadioButton("Rojo");
        this.getContentPane().add(optRojo, new AbsoluteConstraints(20, 20, 100, 20));
        optVerde = new JRadioButton("Verde");
        this.getContentPane().add(optVerde, new AbsoluteConstraints(20, 50, 100, 20));
        optAzul = new JRadioButton("Azul");
        this.getContentPane().add(optAzul, new AbsoluteConstraints(20, 80, 100, 20));
        grupo=new ButtonGroup();
        grupo.add(optRojo);
        grupo.add(optVerde);
        grupo.add(optAzul);
        btnAceptar=new JButton("ACEPTAR");
        this.getContentPane().add(btnAceptar, new AbsoluteConstraints(10, 120, 100, 20));
        etiResultado = new JLabel();
        this.getContentPane().add(etiResultado, new AbsoluteConstraints(10, 150, 450, 30));
        etiResultado.setBorder(new LineBorder(Color.black,2,true));
        this.getContentPane().add(etiResultado,new AbsoluteConstraints(10,150,450,30));
        panel = new JPanel();
        this.getContentPane().add(panel, new AbsoluteConstraints(10, 5, 150, 100));
        panel.setBorder(new TitledBorder(new LineBorder(Color.CYAN,3,true), "Colores"));
        this.getContentPane().add(panel,new AbsoluteConstraints(10, 5,150,100));
}
}

