/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author duban
 */
public class Silla extends JPanel implements ActionListener{
    //Rutas
    public final static String generalON = "/img/GeneralON.png";
    public final static String generalOFF = "/img/GeneralOFF.png";
    public final static String vipON = "/img/vipON.png";
    
    private JButton[] btnSillaGeneral = new JButton[30];
    private JButton[] btnSillaVIP = new JButton[12];
    
    public Silla(){
        setLayout(new GridLayout(7,6,8,7));
        setBorder(new EmptyBorder(9,9,90,22));
        
        for(int i=0;i<btnSillaGeneral.length;i++){
            btnSillaGeneral[i] = new JButton(""+(i+1));
            btnSillaGeneral[i].setIcon(new ImageIcon(getClass().getResource(generalON)));
            btnSillaGeneral[i].addActionListener(this);
            add(btnSillaGeneral[i]);
        }
        
        for(int i=0;i<btnSillaVIP.length;i++){
            btnSillaVIP[i] = new JButton(""+(i+31));
            btnSillaVIP[i].setIcon(new ImageIcon(getClass().getResource(vipON)));
            btnSillaVIP[i].addActionListener(this);
            add(btnSillaVIP[i]);
        }
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i=0;i<btnSillaGeneral.length;i++){
            if(e.getSource() == btnSillaGeneral[i]){
                btnSillaGeneral[i].setIcon(new ImageIcon(getClass().getResource(generalOFF)));
            }
        }
        
        for (int i = 0; i < btnSillaVIP.length; i++) {
            if(e.getSource() == btnSillaVIP[i]){
                btnSillaVIP[i].setIcon(new ImageIcon(getClass().getResource(generalOFF)));
            }
            
        }
    }
    
}
