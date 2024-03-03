package model;

import model.abstractClass.VeiculoTerrestre;

public class Onibus  extends VeiculoTerrestre{
    
    private int quantPassageiro;

    public Onibus(double valorCompra, Motor motor, String placa, int quantPassageiro) {
        super( valorCompra, motor, placa);
        
        this.quantPassageiro=quantPassageiro;
    }

    /**
     * @return double return the quantPassageiro
     */
    public double getQuantPassageiro() {
        return quantPassageiro;
    }

    /**
     * @param quantPassageiro the quantPassageiro to set
     */
    public void setQuantPassageiro(int quantPassageiro) {
        this.quantPassageiro = quantPassageiro;
    }

    @Override
    public String toString() {
        return super.toString() + "\n quantidade de passageiros: "+ getQuantPassageiro();
    }




}
