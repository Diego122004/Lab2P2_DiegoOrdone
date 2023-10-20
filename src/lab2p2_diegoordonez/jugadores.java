
package lab2p2_diegoordonez;


public class jugadores {
    private String nombre;
    private int cantidad;
    private double PR;
    private double dinero;
    
    public jugadores(){
    }
    public jugadores(String name, int can, double pr,double money){
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

    @Override
    public String toString() {
        return "jugadores{" + "nombre=" + nombre + ", cantidad de carros=" + cantidad + ", Puntos de Reputacion=" + PR + ", dinero en el banco=" + dinero + '}';
    }
    
}
