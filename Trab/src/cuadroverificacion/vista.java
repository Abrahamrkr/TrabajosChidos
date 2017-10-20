package cuadroverificacion;

import java.awt.Color;
import javax.swing.*;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.*;

public class vista extends JFrame {
    JButton btnAceptar;
    JLabel etiResultado;
    JCheckBox chkPerro, chkGato, chkRaton;
    
    public vista () {
        this.setTitle("CUADRO VERIFICACION");
        this.setSize(500, 250);
        this.getContentPane().setLayout(new AbsoluteLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        chkPerro = new JCheckBox("Perro");
        this.getContentPane().add(chkPerro, new AbsoluteConstraints(10, 10, 100, 20));
        chkGato = new JCheckBox("Gato");
        this.getContentPane().add(chkGato, new AbsoluteConstraints(10, 40, 100, 20));
        chkRaton = new JCheckBox("Raton");
        this.getContentPane().add(chkRaton, new AbsoluteConstraints(10, 70, 100, 20));
        btnAceptar=new JButton("ACEPTAR");
        this.getContentPane().add(btnAceptar, new AbsoluteConstraints(10, 100, 100, 20));
        etiResultado = new JLabel();
        this.getContentPane().add(etiResultado, new AbsoluteConstraints(10, 130, 450, 30));
        etiResultado.setBorder(new LineBorder(Color.black,5,true));
        this.getContentPane().add(etiResultado,new AbsoluteConstraints(10,130,450,30));
    
}
}
