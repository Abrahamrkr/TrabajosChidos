package Ejercicio4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controlador implements ActionListener{
Vista v;
    public Controlador(){
        v=new Vista();
        v.setVisible(true);
        v.btnActivar.addActionListener(this);
        v.btnDesactivar.addActionListener(this);
        v.btnAceptar.addActionListener(this);
        
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(v.btnAceptar==ae.getSource()){
            v.etiFrase.setText(" USTED SE LLAMA "+v.txtNombre.getText()+" Y VIVE EN "+v.txtCiudad.getText());
        }
        if(v.btnDesactivar==ae.getSource()){
            v.txtNombre.setEnabled(false);
            v.txtCiudad.setEnabled(false);
        }
        if(v.btnActivar==ae.getSource()){
             v.txtNombre.setEnabled(true);
            v.txtCiudad.setEnabled(true);
        }
        
        
    }
    public static void main(String[] args) {
        Controlador c=new Controlador();
    }
    
    
}
