package MenuBar;

import java.awt.Color;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import org.netbeans.lib.awtextra.*;

public class Vista extends JFrame {

    JMenuBar barraMenus;
    JMenu menuArchivo, menuEdicion, menuInsertar,menuColor;
    JMenuItem menuItemAbrir, menuItemGuardar,menuSalir,menuItemRojo,menuItemVerde,menuItemAzul;
    JSeparator Separador;

    public Vista() {
        this.setTitle("Menus");
        this.setSize(500, 500);
        this.getContentPane().setLayout(new AbsoluteLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        barraMenus = new JMenuBar();
        this.getContentPane().add(barraMenus, new AbsoluteConstraints(0, 0, 500, 40));
        
        menuArchivo=new JMenu("Archivo");
        menuItemAbrir=new JMenuItem("Abrir");
        menuItemGuardar=new JMenuItem("Guardar");
        Separador=new JSeparator();
        menuSalir=new JMenuItem("Salir");
        barraMenus.add(menuArchivo);
        menuArchivo.add(menuItemAbrir);
        menuArchivo.add(menuItemGuardar);
        menuArchivo.add(Separador);
        menuArchivo.add(menuSalir);
        
        menuEdicion=new JMenu("Edicion");
        menuColor=new JMenu("Colores");
        menuItemRojo=new JMenuItem("Rojo");
        menuItemVerde=new JMenuItem("Verde");
        menuItemAzul=new JMenuItem("Azul");
        barraMenus.add(menuEdicion);
        menuEdicion.add(menuColor);
        menuColor.add(menuItemRojo);
        menuColor.add(menuItemVerde);
        menuColor.add(menuItemAzul);
        
        menuInsertar=new JMenu ("insertar");
        barraMenus.add(menuInsertar);
        
    }

    public static void main(String[] args) {
        Vista v = new Vista();
        v.setVisible(true);
    }
}
