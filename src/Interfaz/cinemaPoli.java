/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author duban
 */
public class cinemaPoli extends JFrame{
    
    private Banner PanelBanner;
    private Silla PanelSilla;
    
    public cinemaPoli(){
        setTitle(" Bienvenido a BearCinema");
        setSize(1080,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo( null );
        
        PanelBanner = new Banner();
        add(PanelBanner,BorderLayout.NORTH);
        
        PanelSilla = new Silla();
        add(PanelSilla,BorderLayout.AFTER_LINE_ENDS);
    }
    
    public static void main(String[] args) {
        cinemaPoli cinema = new cinemaPoli();
        cinema.setVisible(true);
    }
}

