package ToggleButton;

import java.awt.Color;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.*;

public class Vista extends JFrame {

    JToggleButton TbInstalacion,TbFormacion,TbAlimentacionBD;
    JLabel etiResultado,etiPrecio;
    JTextField txt;
    

    public Vista() {
        this.setTitle("Toggle");
        this.setSize(270, 270);
        this.getContentPane().setLayout(new AbsoluteLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);

        
        
        etiPrecio =new JLabel("Precio Base");
        this.getContentPane().add(etiPrecio, new AbsoluteConstraints(60, 20, 150, 20));
        TbInstalacion =new JToggleButton("Instalacion 0");
        this.getContentPane().add(TbInstalacion, new AbsoluteConstraints(60, 80, 150, 20));
        TbFormacion =new JToggleButton("Formacion 0");
        this.getContentPane().add(TbFormacion, new AbsoluteConstraints(60, 110, 150, 20));
        TbAlimentacionBD =new JToggleButton("Alimentacion BD 0");
        this.getContentPane().add(TbAlimentacionBD, new AbsoluteConstraints(60, 140, 150, 20));
        txt =new JTextField();
        this.getContentPane().add(txt, new AbsoluteConstraints(60, 40, 150, 20));
        etiResultado = new JLabel();
        this.getContentPane().add(etiResultado, new AbsoluteConstraints(60, 200,150, 30));
        etiResultado.setBorder(new LineBorder(Color.black, 5, true));
        this.getContentPane().add(etiResultado, new AbsoluteConstraints(60, 200, 150, 30));
        

    }
}
