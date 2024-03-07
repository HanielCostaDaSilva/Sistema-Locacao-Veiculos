package model;

import model.abstractClass.VeiculoTerrestre;

public class Onibus  extends VeiculoTerrestre{
    
    private int quantPassageiro;
    private double acrescimoQuantPassageiro = 100;
    private double acrescimo = 0.04;

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


    public double calcularDiaria() {
        return (this.quantPassageiro * acrescimoQuantPassageiro ) + (acrescimo * this.getValorCompra());
    }

    @Override
    public String toString() {
        return super.toString() + "\n quantidade de passageiros: "+ getQuantPassageiro();
    }




}
