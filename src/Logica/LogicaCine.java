package Logica;

public class LogicaCine {
    private double porcentajeOcupado;
    private double totalDinero;
    private int[] tipoSillaDisponible; 
    private SillaCoordenada[] sillaDisponible;

    public LogicaCine() {
        tipoSillaDisponible = new int[2];
        sillaDisponible = new SillaCoordenada[42];
        
        porcentajeOcupado = 0;
        totalDinero = 0;
        tipoSillaDisponible[0] = 30;
        tipoSillaDisponible[1] = 12;
        
        int i = 0;
            for (int j = 0; j < 7; j++) {
                for (int k = 0; k < 6; k++) {
                    sillaDisponible[i] = new SillaCoordenada(j+1,k+1);
                    i++;
                }
                
            }
    }
    
    public void setTipoSillaDisponible1(int n){
        tipoSillaDisponible[0] = tipoSillaDisponible[0] + n;
    }
    
    public void setTipoSillaDisponible2(int n){
        tipoSillaDisponible[1] = tipoSillaDisponible[1] + n;
    }
    
    public void setPorcentajeOcupado(){
        porcentajeOcupado = (42 - tipoSillaDisponible[0] - tipoSillaDisponible[1])*100/42;
    }
    
    
    public double getPorcentajeOcupado(){
        return porcentajeOcupado;
    }
    
    public double getTotalDinero(){
        return totalDinero;
    }

    public String mostrarCoordenadas(Logica Cine) {
        String posiciones = "| ";
        for(int i=0;i<Cine.getLgcSillaGeneral().length;i++){
            if(Cine.getLgcSillaGeneral()[i].getEstado()){
                posiciones += sillaDisponible[i].getFila()+" , "+sillaDisponible[i].getColumna()+"| - |";
            }
            
            if((i+1)%5==0){
                posiciones += "\n|";
            }
        }
        
        for (int i = 0; i < Cine.getLgcSillaVIP().length; i++) {
            if(Cine.getLgcSillaVIP()[i].getEstado()){
                posiciones += sillaDisponible[i+30].getFila()+" , "+sillaDisponible[i+30].getColumna()+"| - |";
            }
            
            if((i+1)%5==0){
                posiciones += "\n|";
            }
            
        }
        return posiciones;
    }
    
    public String MostrarSillasPorTipo(){
        
        return "\nGeneral: "+tipoSillaDisponible[0] + "\nVIP: "+tipoSillaDisponible[1];
    }
    
    
    
    public void setTotalDinero(LogicaSilla tipoSilla,int n, Logica a){
        if(n==1){
            totalDinero += tipoSilla.getPrecio();
        }
        
        if(n==-1){
            totalDinero -= tipoSilla.getPrecio();
        }
        
        
    }
}
