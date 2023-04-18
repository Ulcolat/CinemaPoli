package Interfaz;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Texto extends JPanel{
    //Atributos
    private JLabel PrecioGeneral;
    private JLabel PrecioVIP;
    
    //Constructor
    public Texto(){
        setBackground(Color.white);//Fondo
        
        PrecioGeneral = new JLabel("Silla General: $9000");//Precio general
        add(PrecioGeneral);//Agregar
        
        PrecioVIP = new JLabel("Silla VIP: $11.000");//Precio VIP
        add(PrecioVIP);//Agregar
        
    }
}
