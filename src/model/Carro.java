package model;

import model.abstractClass.VeiculoTerrestre;

public class Carro extends VeiculoTerrestre{
    
    private double autonomia;

    public Carro(double valorCompra, Motor motor, String placa, double autonomia) {
        super( valorCompra, motor, placa);
        
        this.autonomia=autonomia;
    }
    
    public String toString() {
        return super.toString()+ "\n autonomia: "+ this.autonomia;
    }



    /**
     * @return double return the autonomia
     */
    public double getAutonomia() {
        return autonomia;
    }

    /**
     * @param autonomia the autonomia to set
     */
    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }




}
