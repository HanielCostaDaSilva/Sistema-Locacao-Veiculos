package model;

import model.abstractClass.VeiculoTerrestre;
import model.enumClass.TipoPartida;


public class Moto extends VeiculoTerrestre {

    private TipoPartida partida;
    private double acrescimo = 0.02;
    private double acrescimoManual = 5.0;
    private double acrescimoEletrico = 20.0;


    public Moto(double valorCompra, Motor motor, String placa, TipoPartida partida) {
        super( valorCompra, motor, placa);

        this.partida = partida;
    }
    public double calcularDiaria() {
        double valorSisPartida = (this.partida.name().equals("MANUAL") ? acrescimoManual : acrescimoEletrico);
        return (acrescimo * this.getValorCompra()) + valorSisPartida;
    }


    public String toString() {
        return super.toString()+ "\n tipo partida: "+ this.partida.name();
    }


    /**
     * @return SistemaPartida return the partida
     */
    public TipoPartida getPartida() {
        return partida;
    }

    /**
     * @param partida the partida to set
     */
    public void setPartida(TipoPartida partida) {
        this.partida = partida;
    }

}
