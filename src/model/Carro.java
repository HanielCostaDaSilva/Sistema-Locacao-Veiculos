package model;

import model.abstractClass.VeiculoTerrestre;

public class Carro extends VeiculoTerrestre{
    
    private double autonomia;

private double acrescimo= 0.02;

    public Carro(double valorCompra, Motor motor, String placa, double autonomia) {
        super( valorCompra, motor, placa);
        
        this.autonomia=autonomia;
    }
    

    public double calcularDiaria() {
        return this.getValorCompra() * acrescimo;
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
