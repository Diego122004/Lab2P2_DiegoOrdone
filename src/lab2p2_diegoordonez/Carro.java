package lab2p2_diegoordonez;

import java.awt.Color;
import java.util.ArrayList;

public class Carro {

    private String marca;
    private String modelo;
    private Color color;
    private double precio;
    private ArrayList<String> mejoras = new ArrayList();
    private int tipo;

    public Carro() {
    }

    public Carro(String marc, String model, Color col, double price, int type) {
        this.marca = marc;
        this.modelo = model;
        this.color = col;
        this.precio = price;
        this.tipo = type;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setMejoras(ArrayList<String> mejoras) {
        this.mejoras = mejoras;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Color getColor() {
        return color;
    }

    public double getPrecio() {
        return precio;
    }

    public ArrayList<String> getMejoras() {
        return mejoras;
    }

    public int getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Carro{" + "marca=" + marca + "\\n modelo=\\n" + modelo + "\\n color \\n" + color + "\\n precio \\n " + precio + "\\n  mejoras\\n " + mejoras + "\\n tipo\\n" + tipo + '}';
    }

   

}
