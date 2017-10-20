package MenuBar;
 import MenuBar.Vista;
import java.awt.Color;
import java.awt.event.*;



public class Controlador implements ActionListener{
    Vista v;
    public Controlador() {
        v = new Vista();
        v.setVisible(true);
        v.menuItemRojo.addActionListener(this);
        v.menuItemVerde.addActionListener(this);
        v.menuItemAzul.addActionListener(this);
        
    }
    public static void main(String[] args) {
        Controlador v = new Controlador();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==v.menuItemRojo){
            v.getContentPane().setBackground(Color.red);
        }
        if(ae.getSource()==v.menuItemAzul){
            v.getContentPane().setBackground(Color.blue);
        }
        if(ae.getSource()==v.menuItemVerde){
            v.getContentPane().setBackground(Color.green);
        }
    }


}
