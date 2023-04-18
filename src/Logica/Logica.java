package Logica;

public class Logica{
    private LogicaSilla[] lgcSillaGeneral = new LogicaSilla[30];
    private LogicaSilla[] lgcSillaVIP = new LogicaSilla[12];
    private LogicaCine lgCine;
   
    public Logica() {
        for (int i = 0; i < lgcSillaGeneral.length; i++) {
            lgcSillaGeneral[i] = new LogicaSilla();
            lgcSillaGeneral[i].setPrecio(9000);
        }
        
        for (int i = 0; i < lgcSillaVIP.length; i++) {
            lgcSillaVIP[i] = new LogicaSilla();
            lgcSillaVIP[i].setPrecio(11000);   
        }
        
        lgCine = new LogicaCine();
    }

    public LogicaSilla[] getLgcSillaGeneral() {
        return lgcSillaGeneral;
    }

    public LogicaSilla[] getLgcSillaVIP() {
        return lgcSillaVIP;
    }

    public LogicaCine getLgCine() {
        return lgCine;
    }
    
    
}
