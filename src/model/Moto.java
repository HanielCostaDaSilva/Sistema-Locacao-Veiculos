package model;

import model.abstractClass.VeiculoTerrestre;
import model.enumClass.TipoPartida;


public class Moto extends VeiculoTerrestre {

    private TipoPartida partida;

    public Moto(double valorCompra, Motor motor, String placa, TipoPartida partida) {
        super( valorCompra, motor, placa);

        this.partida = partida;
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
