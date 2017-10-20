package Ejercicio13;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {

    Vista v;
    String a, b;

    public Controlador() {
        v = new Vista();
        v.setVisible(true);
        v.btnConcatena.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String a = v.txtPal1.getText();
        String b = v.txtPal2.getText();
        v.etiTexto.setText(a + b);

    }

    public static void main(String[] args) {
        Controlador c = new Controlador();
    }
}
