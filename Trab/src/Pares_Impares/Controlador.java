package Pares_Impares;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Controlador implements ActionListener {

    Vista v;

    public Controlador() {
        v = new Vista();
        v.setVisible(true);
        v.combo.addActionListener(this);
        v.btnPares.addActionListener(this);
        v.btnImpares.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == v.btnPares) {
            int i;

            DefaultComboBoxModel modelo = new DefaultComboBoxModel();

            for (i = 0; i < 10; i += 2) {
                modelo.addElement("Nº " + i);
            }

            v.combo.setModel(modelo);
        }
        if (ae.getSource() == v.btnImpares) {
            int i;
            DefaultComboBoxModel modelo = new DefaultComboBoxModel();

            for (i = 1; i < 10; i += 2) {
                modelo.addElement("Nº " + i);
            }

            v.combo.setModel(modelo);
        }
        String mensaje = "";
        mensaje = mensaje + v.combo.getSelectedItem().toString();
        v.etiResultado.setText(mensaje);
    }

    public static void main(String[] args) {
        Controlador c = new Controlador();

    }
}
