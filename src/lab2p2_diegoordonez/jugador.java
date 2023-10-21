
package lab2p2_diegoordonez;

import java.util.ArrayList;


public class jugador {
    private String nombre;
    private int cantidad;
    private double PR;
    private double dinero;
    private ArrayList<Carro> carcan = new ArrayList();
    
    public jugador(){
    }
    public jugador(String name, int can, double pr,double money){
        this.nombre = name;
        this.cantidad = can;
        this.PR  = pr;
        this.dinero = money;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPR() {
        return PR;
    }

    public double getDinero() {
        return dinero;
    }

    public ArrayList<Carro> getCarcan() {
        return carcan;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPR(double PR) {
        this.PR = PR;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public void setCarcan(ArrayList<Carro> carcan) {
        this.carcan = carcan;
    }

   @Override
    public String toString() {
        return "Nombre: " + nombre + "\n Cantidad de Carros: " + cantidad + "\n Reputación: " + PR + "\n Dinero en cuenta: " + dinero;
    }
    
}
