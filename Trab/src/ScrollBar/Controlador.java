package ScrollBar;

import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class Controlador implements AdjustmentListener {
    Vista v;
    public Controlador() {
        v = new Vista();
        v.setVisible(true);
        v.scr.addAdjustmentListener(this);
    }
    public static void main(String[] args) {
        Controlador v = new Controlador();
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent ae) {
        v.etiValor.setText("El valor es: "+v.scr.getValue());
    }

}
