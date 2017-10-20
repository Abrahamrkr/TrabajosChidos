package botones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {

    Vista v;

    public Controlador() {
        v = new Vista();
        v.setVisible(true);
        v.btnAceptar.setActionCommand("ACEPTAR");
        v.optRojo.addActionListener(this);
        v.optVerde.addActionListener(this);
        v.optAzul.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String mensaje = "Colores elegidos: ";
        if (v.optRojo.isSelected()) {
            mensaje = mensaje + "Rojo ";
        }

        if (v.optVerde.isSelected()) {
            mensaje = mensaje + "Verde ";
        }

        if (v.optAzul.isSelected()) {
            mensaje = mensaje + "Azul ";
        }

        v.etiResultado.setText(mensaje);
    }
    public static void main(String[] args) {
        Controlador c=new Controlador();
    }
}

