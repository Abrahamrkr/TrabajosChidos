package Ejercicio1;

import java.awt.Color;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import org.netbeans.lib.awtextra.*;

public class Vista extends JFrame {
    JButton btnOCiudad,btnMCiudad,btnONombre,btnMNombre;
    JLabel etiCiudad, etiNombre;
    
    public Vista () {
        this.setTitle("CiudadNombre");
        this.setSize(500, 250);
        this.getContentPane().setLayout(new AbsoluteLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        btnOCiudad = new JButton("OCULTAR CIUDAD");
        this.getContentPane().add(btnOCiudad, new AbsoluteConstraints(20, 80, 200, 20));
        btnMCiudad = new JButton("MOSTRAR CIUDAD");
        this.getContentPane().add(btnMCiudad, new AbsoluteConstraints(20, 110, 200, 20));
        btnONombre = new JButton("OCULTAR NOMBRE");
        this.getContentPane().add(btnONombre, new AbsoluteConstraints(240, 80, 200, 20));
        btnMNombre=new JButton("MOSTRAR NOMBRE");
        this.getContentPane().add(btnMNombre, new AbsoluteConstraints(240,110 , 200, 20));
        etiCiudad = new JLabel("Baltimore");
        this.getContentPane().add(etiCiudad, new AbsoluteConstraints(20, 20, 200, 30));
        etiNombre = new JLabel("Rallo Macuin q chau");
        this.getContentPane().add(etiNombre, new AbsoluteConstraints(20, 50, 200, 30));
       
}
}
