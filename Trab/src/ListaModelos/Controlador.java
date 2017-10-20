package ListaModelos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Controlador implements ListSelectionListener, ActionListener {

    Vista v;

    public Controlador() {
        v = new Vista();
        v.setVisible(true);
        v.btnCurso1.addActionListener(this);
        v.btnCurso2.addActionListener(this);
        v.lista.addListSelectionListener(this);

    }

    public static void main(String[] args) {
        Controlador c = new Controlador();
    }

    @Override
    public void valueChanged(ListSelectionEvent lse) {
        String mensaje;
       if (v.lista.getSelectedIndex() == -1) {
            mensaje = "";
        } else {
            mensaje ="Seleccionaste a : " + v.lista.getSelectedValue().toString();
        }
        v.etiResultado.setText(mensaje);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == v.btnCurso1) {
            DefaultListModel modelo = new DefaultListModel();
            modelo.addElement("Juan");
            modelo.addElement("María");
            modelo.addElement("Luis");
            v.lista.setModel(modelo);
        }
        if (ae.getSource() == v.btnCurso2) {
            DefaultListModel modelo = new DefaultListModel();
            modelo.addElement("Ana");
            modelo.addElement("Marta");
            modelo.addElement("Jose");
            v.lista.setModel(modelo);
        }
    }
}
