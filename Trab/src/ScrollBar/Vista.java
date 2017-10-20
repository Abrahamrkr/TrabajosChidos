package ScrollBar;

import java.awt.Color;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import org.netbeans.lib.awtextra.*;

public class Vista extends JFrame {

    JScrollBar scr;
    JLabel etiValor;

    public Vista() {
        this.setTitle("EzkrolVar");
        this.setSize(500, 250);
        this.getContentPane().setLayout(new AbsoluteLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        scr = new JScrollBar();
        this.getContentPane().add(scr, new AbsoluteConstraints(20, 20, 450, 20));
        scr.setOrientation(0);
        etiValor=new JLabel();
        this.getContentPane().add(etiValor, new AbsoluteConstraints(20, 40, 450, 20));
        etiValor.setBorder(new LineBorder(Color.black, 5, true));
        this.getContentPane().add(etiValor, new AbsoluteConstraints(20, 100, 450, 30));
        scr.setMaximum(150);
        scr.setMinimum(50);
        scr.setUnitIncrement(2);
        scr.setBlockIncrement(20);
        scr.setVisibleAmount(5);
    }

    public static void main(String[] args) {
        Vista v = new Vista();
        v.setVisible(true);
    }
}
