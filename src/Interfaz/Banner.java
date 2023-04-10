/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author duban
 */
public class Banner extends JPanel{
    public final static String rutaBanner = "/img/BannerCine.png";
    
    //Atributos
    JLabel imgBanner;
    
    public Banner(){
        setBackground(Color.DARK_GRAY);
        setSize(200,200);
        imgBanner  = new JLabel();
        imgBanner.setIcon(new ImageIcon(getClass().getResource(rutaBanner)));
        add(imgBanner);
    }
    
}
