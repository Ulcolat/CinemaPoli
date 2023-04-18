
package Interfaz;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Banner extends JPanel{
    public final static String rutaBanner = "/img/BannerCine.png";//Ruta de la imagen
    
    //Atributos
    JLabel imgBanner;
    
    //Contructor
    public Banner(){
        imgBanner  = new JLabel();//Instanciar banner
        imgBanner.setIcon(new ImageIcon(getClass().getResource(rutaBanner)));//Imagen que tendrá el banner
        add(imgBanner);//Agregar componente
    }
    
}