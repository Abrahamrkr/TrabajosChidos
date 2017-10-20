
package Sliders;

import java.awt.Color;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.*;

public class Vista extends JFrame {
    JSlider barra;
    JLabel resultado;
    

    public Vista() {
        this.setTitle("Sliders");
        this.setSize(350, 200);
        this.getContentPane().setLayout(new AbsoluteLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        barra= new JSlider();
        this.getContentPane().add(barra, new AbsoluteConstraints(20, 20, 300, 40));
        resultado= new JLabel();
        this.getContentPane().add(resultado, new AbsoluteConstraints(20, 120, 300, 20));
        resultado.setBorder(new LineBorder(Color.PINK, 3, true));
        this.getContentPane().add(resultado, new AbsoluteConstraints(20, 120, 300, 20));
        barra.setMaximum(500);
        barra.setMinimum(100);
        barra.setValue(400);
        barra.setMajorTickSpacing(50);
        barra.setPaintTicks(true);
        barra.setPaintLabels(true);
    }
}