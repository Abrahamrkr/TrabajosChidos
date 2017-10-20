package ToggleButton;

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
        v.TbAlimentacionBD.addActionListener(this);
        v.TbFormacion.addActionListener(this);
        v.TbInstalacion.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        double precio_base;
        

//Recojo datos desde la ventana:
        precio_base = esNumero(v.txt.getText());
        

//Ahora que tengo los datos, puedo hacer cálculos.
//Al precio base se le van añadiendo precio de extras
//según estén o no activados los JToggleButtons
        double precio_total;

        precio_total = precio_base;

        if (v.TbInstalacion.isSelected()) { //Si se seleccionó instalación
            precio_total = precio_total + 40;
            v.TbInstalacion.setText("Instalacion 40");
        }
        else{
            v.TbInstalacion.setText("Instalacion 0");
        }

        if (v.TbFormacion.isSelected()) { //Si se seleccionó formación
            precio_total = precio_total + 200;
            v.TbFormacion.setText("Formacion 200");
        }
        else{
            v.TbFormacion.setText("Formacion 0");
        }

        if (v.TbAlimentacionBD.isSelected()) { //Si se seleccionó Alimentación BD
            precio_total = precio_total + 200;
            v.TbAlimentacionBD.setText("Alimentacion BD 200");
        }
        else{
            v.TbAlimentacionBD.setText("Alimentacion BD 0");
        }

//Finalmente pongo el resultado en la etiqueta
        v.etiResultado.setText(precio_total + " €");
    }
    public int esNumero(String txt){
        int x;
        try{
            x=Integer.parseInt(txt);
        }catch(Exception e){
            x=0;
        }
        return x;
    }

    public static void main(String[] args) {
        Controlador c = new Controlador();

    }
}
