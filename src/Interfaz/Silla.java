
package Interfaz;

import Logica.*;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Silla extends JPanel implements ActionListener{
    //Rutas
    public final static String generalON = "/img/GeneralON.png";//Silla general
    public final static String generalOFF = "/img/GeneralOFF.png";//Silla general y vip ocupada
    public final static String vipON = "/img/vipON.png";//silla vip
    
    //Atributos
    private JButton[] btnSillaGeneral = new JButton[30];
    private JButton[] btnSillaVIP = new JButton[12];
    private Logica Cine;
    
    public Silla(){
        setLayout(new GridLayout(7,6,8,5));//Cantidad de botones, separacion de espacio entre boton, etc
        setBorder(new EmptyBorder(9,9,90,22));//Asignar borde de los botones
        setBackground(Color.white);//Fondo
        
        
        
        for(int i=0;i<btnSillaGeneral.length;i++){//Instanciar botones para las sillas GENERALES
            btnSillaGeneral[i] = new JButton(""+(i+1));//Puesto del boton
            btnSillaGeneral[i].setIcon(new ImageIcon(getClass().getResource(generalON)));//Cambiar el boton por una imagen
            btnSillaGeneral[i].addActionListener(this);//Escuchador
            btnSillaGeneral[i].setBackground(Color.white);//Cambiar fondo del boton
            add(btnSillaGeneral[i]);//Agregar
        }
        

        
        for(int i=0;i<btnSillaVIP.length;i++){//Instanciar botones para las sillas VIP
            btnSillaVIP[i] = new JButton(""+(i+31));//Puesto del botn            
            btnSillaVIP[i].setIcon(new ImageIcon(getClass().getResource(vipON)));//Cambiar el boton por una imagen
            btnSillaVIP[i].addActionListener(this);//Escuchador
            btnSillaVIP[i].setBackground(Color.white);//Cambiar fondo
            add(btnSillaVIP[i]);//Agregar
        }
        
        Cine = new Logica();//Instanciar
    }

    public Logica getCine() {//Get
        return Cine;
    }

    public void actionPerformed(ActionEvent e) {//Escuchadores
        for(int i=0;i<btnSillaGeneral.length;i++){//Para la silla general
            if(e.getSource() == btnSillaGeneral[i] && Cine.getLgcSillaGeneral()[i].getEstado()==true){//Cuando la silla está disponible
                btnSillaGeneral[i].setIcon(new ImageIcon(getClass().getResource(generalOFF)));//Cambia de color
                Cine.getLgCine().setTipoSillaDisponible1(-1);//Cantidad de sillas disminuye
                Cine.getLgCine().setTotalDinero(Cine.getLgcSillaGeneral()[i], 1,Cine);//Dinero total aumenta
                Cine.getLgCine().setPorcentajeOcupado();//Porcentaje cambia
                Cine.getLgcSillaGeneral()[i].setEstado(false);//Estado de la silla cambia
            }else if(e.getSource() == btnSillaGeneral[i] && Cine.getLgcSillaGeneral()[i].getEstado()==false){//Cuando está ocupada
                btnSillaGeneral[i].setIcon(new ImageIcon(getClass().getResource(generalON)));//Cambia de color
                Cine.getLgCine().setTipoSillaDisponible1(1);//Sillas disponibles aumentan
                Cine.getLgCine().setTotalDinero(Cine.getLgcSillaGeneral()[i], -1,Cine);//Dinero total disminuye
                Cine.getLgCine().setPorcentajeOcupado();//Porcentaje cambia
                Cine.getLgcSillaGeneral()[i].setEstado(true);//Estado de la silla cambia
            }
        }
        
        for (int i = 0; i < btnSillaVIP.length; i++) {//Para la silla VIP
            if(e.getSource() == btnSillaVIP[i] && Cine.getLgcSillaVIP()[i].getEstado() == true){//Cuando la silla está disponible
                btnSillaVIP[i].setIcon(new ImageIcon(getClass().getResource(generalOFF)));//Cambia de color
                Cine.getLgCine().setTipoSillaDisponible2(-1);//Cantidad de sillas disminuye
                Cine.getLgCine().setTotalDinero(Cine.getLgcSillaVIP()[i], 1,Cine); //Dinero total aumenta
                Cine.getLgCine().setPorcentajeOcupado();
                Cine.getLgcSillaVIP()[i].setEstado(false);
            }else if(e.getSource() == btnSillaVIP[i] && Cine.getLgcSillaVIP()[i].getEstado() == false){
                btnSillaVIP[i].setIcon(new ImageIcon(getClass().getResource(vipON)));
                Cine.getLgCine().setTipoSillaDisponible2(1);
                Cine.getLgCine().setTotalDinero(Cine.getLgcSillaVIP()[i], -1,Cine);
                Cine.getLgCine().setPorcentajeOcupado();
                Cine.getLgcSillaVIP()[i].setEstado(true);
            }
            
        }
    }
    
}
