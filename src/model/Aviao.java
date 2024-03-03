package model;

import model.abstractClass.VeiculoAereo;

public class Aviao extends VeiculoAereo {
    
    private double velocidadeCruzeiro ;


    public Aviao(double valorCompra, double tempoVoo, int velocidadeCruzeiro) {
        super(valorCompra, tempoVoo);
        this.velocidadeCruzeiro = velocidadeCruzeiro;
    }


    public  String toString() {

        return super.toString()+ "\nVelocidade Cruzeiro: "+this.velocidadeCruzeiro;
    }


    /**
     * @return double return the velocidadeCruzeiro
     */
    public double getVelocidadeCruzeiro() {
        return velocidadeCruzeiro;
    }

    /**
     * @param velocidadeCruzeiro the velocidadeCruzeiro to set
     */
    public void setVelocidadeCruzeiro(double velocidadeCruzeiro) {
        this.velocidadeCruzeiro = velocidadeCruzeiro;
    }

}
