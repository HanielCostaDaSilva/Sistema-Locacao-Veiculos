package model;

import model.abstractClass.VeiculoAereo;

public class Helicoptero extends VeiculoAereo{

    private int quantRotores;
    
    public Helicoptero( double valorCompra, double tempoVoo, int quantRotores) {
        super(valorCompra, tempoVoo);
        this.quantRotores = quantRotores;
        
    }

    public  String toString() {

        return super.toString()+ "\nquantidade de Rotores: "+quantRotores;
    }

    /**
     * @return int return the quantRotores
     */
    public int getQuantRotores() {
        return quantRotores;
    }

    /**
     * @param quantRotores the quantRotores to set
     */
    public void setQuantRotores(int quantRotores) {
        this.quantRotores = quantRotores;
    }

}
