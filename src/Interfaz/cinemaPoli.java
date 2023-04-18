package Interfaz;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class cinemaPoli extends JFrame implements ActionListener{

    //Atributos
    private JPanel Panel;
    private Banner PanelBanner;
    private Silla PanelSilla;
    private Texto Precios;
    private JButton btnPorcentaje;
    private JButton btnDineroTotal;
    private JButton btnSillaPorTipo;
    private JButton btnSillaPorPosicion; 
    
    //Constructor
    public cinemaPoli(){
        setTitle(" Bienvenido a BearCinema");//Titulo de la interfaz
        setSize(1080,600);//Tamaño de la interfaz
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Terminar la ecuacion cuando cierre la ventana
        setResizable(false);//No cambiar tamaño
        setLocationRelativeTo( null );//Empiece en el centro
        
        GridBagLayout layout = new GridBagLayout();//Instanciando objeto
        GridBagConstraints gridCons = new GridBagConstraints();//Complemento del objeto anterior
        
        Panel = new JPanel(layout);//Instanciando panel
        Panel.setBackground(Color.WHITE);//Cambiando color
        
        PanelBanner = new Banner();//Instanciando el Banner
        gridCons.gridx=0;//Columna donde estará el objeto
        gridCons.gridy=0;//Filas donde estará
        gridCons.gridwidth = 2;//Columnas que ocupará
        gridCons.gridheight = 1;//Filas que ocupará
        Panel.add(PanelBanner, gridCons);//Agregando el banner en las coordenadas dadas anteriormente
        
        
        PanelSilla = new Silla();//Instanciando sillas
        gridCons.gridx=1;//Columna
        gridCons.gridy=1;//Fila
        gridCons.gridwidth = 1;//Espacio de columnas
        gridCons.gridheight = 4;//Espacio de filas
        Panel.add(PanelSilla, gridCons);//Agregar
        
        btnPorcentaje = new JButton("Porcentaje de sillas ocupadas");//Instanciando boton para el porcentaje
        btnPorcentaje.addActionListener(this);//Escuchador de acciones
        btnPorcentaje.setBackground(Color.white);//Cambiando fondo del boton
        gridCons.gridx=0;//Columna
        gridCons.gridy=1;//Fila
        gridCons.gridwidth = 1;//Espacio de columnas
        gridCons.gridheight = 1;//Espacio de filas
        Panel.add(btnPorcentaje, gridCons);//Agregar

        btnDineroTotal = new JButton("Dinero total recaudado");//Instanciando boton para el dinero recaudado
        btnDineroTotal.addActionListener(this);//Escuchador
        btnDineroTotal.setBackground(Color.white);//Cambiando fondo del boton
        gridCons.gridx=0;//Columna
        gridCons.gridy=2;//Filas
        gridCons.gridwidth = 1;//Espacio
        gridCons.gridheight = 1;//ESpacio
        Panel.add(btnDineroTotal, gridCons);//Agregar
        
        btnSillaPorTipo = new JButton("Sillas disponibles por tipo");//Instanciar boton sillas disponibles por tipo
        btnSillaPorTipo.addActionListener(this);//Escuchador
        btnSillaPorTipo.setBackground(Color.white);//Fondo
        gridCons.gridx=0;//Columna
        gridCons.gridy=3;//Fila
        gridCons.gridwidth = 1;//Espacio
        gridCons.gridheight = 1;//Espacio
        Panel.add(btnSillaPorTipo, gridCons);//Agregar
        
        btnSillaPorPosicion = new JButton("Silla disponibles por posición");//Instanciar boton sillas disponibles por posicion
        btnSillaPorPosicion.addActionListener(this);//Escuchador
        btnSillaPorPosicion.setBackground(Color.white);//Fondo
        gridCons.gridx=0;//Columna
        gridCons.gridy=4;//Fila
        gridCons.gridwidth = 1;//Espacio
        gridCons.gridheight = 1;//Espacio
        Panel.add(btnSillaPorPosicion, gridCons);//Agregar
        
        Precios = new Texto();//Instanciar labels de los precios
        gridCons.gridx=0;//Columna
        gridCons.gridy=5;//Fila
        gridCons.gridwidth = 2;//Espacio
        gridCons.gridheight = 1;//Espacio
        Panel.add(Precios, gridCons);//Agregar
        
        
        add(Panel);//Agregar panel al frame
    }
    
    public static void main(String[] args) {
        cinemaPoli cinema = new cinemaPoli();//Creacion de objeto
        cinema.setVisible(true);//Mostrar objeto
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnPorcentaje){//Que hacer si presiona el boton de porcentaje
            JOptionPane.showMessageDialog(null, "Porcentaje de sillas ocupadas: "+PanelSilla.getCine().getLgCine().getPorcentajeOcupado(),"Porcentaje de sillas ocupadas",JOptionPane.INFORMATION_MESSAGE);
        }
        
        if(e.getSource() == btnDineroTotal){//Que hacer si presiona el boton de dinerototal
            JOptionPane.showMessageDialog(null, "Dinero recaudado: "+PanelSilla.getCine().getLgCine().getTotalDinero(),"Dinero total recaudado",JOptionPane.INFORMATION_MESSAGE);
        }
        
        if(e.getSource() == btnSillaPorTipo){//Que hacer si presiona el boton de sillaPorTipo
            JOptionPane.showMessageDialog(null, "Sillas disponible por tipo: "+PanelSilla.getCine().getLgCine().MostrarSillasPorTipo(), "Sillas disponibles por tipo", JOptionPane.INFORMATION_MESSAGE);
        }
        
        if(e.getSource() == btnSillaPorPosicion){//Que hacer si presiona el boton de sillaPorPosicion
            JOptionPane.showMessageDialog(null, "Sillas libres por posicion\n"+PanelSilla.getCine().getLgCine().mostrarCoordenadas(PanelSilla.getCine()),"Sillas libres por posicion",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}