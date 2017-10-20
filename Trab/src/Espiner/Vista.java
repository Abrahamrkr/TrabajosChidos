package Espiner;

import java.awt.Color;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.*;

public class Vista extends JFrame {
JLabel res;
JSpinner spi;
    

    public Vista() {
        this.setTitle("Espiner");
        this.setSize(150, 150);
        this.getContentPane().setLayout(new AbsoluteLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        res=new JLabel();
        this.getContentPane().add(res,new AbsoluteConstraints(10,50,100,25));
        res.setBorder(new LineBorder(Color.PINK, 3, true));
        this.getContentPane().add(res,new AbsoluteConstraints(10,50,100,25));
        spi=new JSpinner();
        this.getContentPane().add(spi,new AbsoluteConstraints(10,10,100,25));
        

    }

}