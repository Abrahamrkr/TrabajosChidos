package ListaModelos;

import java.awt.Color;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.*;

public class Vista extends JFrame {

    JList lista;
    JLabel etiResultado;
    JButton btnCurso1,btnCurso2;
    

    public Vista() {
        this.setTitle("Combo");
        this.setSize(500, 350);
        this.getContentPane().setLayout(new AbsoluteLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        btnCurso1=new JButton("Curso1");
        this.getContentPane().add(btnCurso1,new AbsoluteConstraints(10,150,100,25));
        btnCurso2=new JButton("Curso2");
        this.getContentPane().add(btnCurso2,new AbsoluteConstraints(10,180,100,25));
        lista=new JList();
        this.getContentPane().add(lista, new AbsoluteConstraints(10, 30, 100, 100));
        etiResultado = new JLabel();
        this.getContentPane().add(etiResultado, new AbsoluteConstraints(10, 130, 450, 30));
        etiResultado.setBorder(new LineBorder(Color.black, 3, true));
        this.getContentPane().add(etiResultado, new AbsoluteConstraints(150, 30, 250, 30));

    }
}
