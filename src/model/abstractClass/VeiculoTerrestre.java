package model.abstractClass;

import model.Motor;

public abstract class VeiculoTerrestre extends Veiculo{
    private Motor motor;
    private String placa;

    public VeiculoTerrestre(double valorCompra, Motor motor, String placa) {
        super(valorCompra);
        this.motor = motor;
        this.placa = placa;
    }
    public String toString() {
        return super.toString()+ "\n"+ this.motor+ "\n placa: " + this.placa;
    }

    /**
     * @return Motor return the motor
     */
    public Motor getMotor() {
        return motor;
    }

    /**
     * @param motor the motor to set
     */
    public void setMotor(Motor motor) {
        this.motor = motor;
    }


    /**
     * @return String return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

}
