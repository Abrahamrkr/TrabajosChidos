package Listas;

import java.awt.Color;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.*;

public class Vista extends JFrame {

    JButton btnAceptar;
    JLabel etiResultado;
    JList lista;

    public Vista() {
        this.setTitle("LISTAS");
        this.setSize(500, 250);
        this.getContentPane().setLayout(new AbsoluteLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        Object[] x = new Object[3];
        x[0] = "Rojo";
        x[1] = "Verde";
        x[2] = "Azul";
        lista = new JList(x);
        this.getContentPane().add(lista, new AbsoluteConstraints(10, 10, 100, 80));
        btnAceptar = new JButton("ACEPTAR");
        this.getContentPane().add(btnAceptar, new AbsoluteConstraints(10, 100, 100, 20));
        etiResultado = new JLabel();
        this.getContentPane().add(etiResultado, new AbsoluteConstraints(10, 130, 450, 30));
        etiResultado.setBorder(new LineBorder(Color.black, 5, true));
        this.getContentPane().add(etiResultado, new AbsoluteConstraints(10, 130, 450, 30));

    }
}
