package Logica;

public class LogicaSilla {
    private int precio;
    private boolean estado;

    public LogicaSilla() {
        this.estado = true;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }    
}
