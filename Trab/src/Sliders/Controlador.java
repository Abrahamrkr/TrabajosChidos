package Sliders;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
public class Controlador implements ChangeListener {

    Vista v;

    public Controlador() {
        v = new Vista();
        v.setVisible(true);

        v.barra.addChangeListener(this);

    }

    public static void main(String[] args) {
        Controlador c = new Controlador();
    }

    @Override
    public void stateChanged(ChangeEvent ce) {
        v.resultado.setText("El valor es: " + v.barra.getValue());
    }

}
