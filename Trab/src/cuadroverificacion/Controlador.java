package cuadroverificacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {

    vista v;

    public Controlador() {
        v = new vista();
        v.setVisible(true);
        v.btnAceptar.setActionCommand("ACEPTAR");
        v.chkPerro.addActionListener(this);
        v.chkGato.addActionListener(this);
        v.chkRaton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String mensaje = "Animales elegidos: ";
        if (v.chkPerro.isSelected()) {
            mensaje = mensaje + "Perro ";
        }

        if (v.chkGato.isSelected()) {
            mensaje = mensaje + "Gato ";
        }

        if (v.chkRaton.isSelected()) {
            mensaje = mensaje + "Raton ";
        }

        v.etiResultado.setText(mensaje);
    }
    public static void main(String[] args) {
        Controlador c=new Controlador();
    }
}
