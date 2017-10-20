package Espiner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Controlador implements ChangeListener {

    Vista v;

    public Controlador() {
        v = new Vista();
        v.setVisible(true);
        v.spi.getChangeListeners();
        v.spi.addChangeListener(this);
        
        SpinnerNumberModel nm = new SpinnerNumberModel();
        nm.setMaximum(10);
        nm.setMinimum(0);
        nm.setStepSize(2);
        v.spi.setModel(nm);
    }

    public static void main(String[] args) {
        Controlador c = new Controlador();
    }

    @Override
    public void stateChanged(ChangeEvent ce) {

        v.res.setText("El valor es: " + v.spi.getValue().toString());
    }

}
