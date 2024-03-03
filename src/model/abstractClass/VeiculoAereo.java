package model.abstractClass;

public abstract class VeiculoAereo extends Veiculo {
    
    private double tempoVoo;
    
    public VeiculoAereo( double valorCompra, double tempoVoo){
        super(valorCompra);
        this.tempoVoo = tempoVoo;

    }
    public String toString() {
        return super.toString()+ "\n tempo de voo: " + this.tempoVoo;
    }

    /**
     * @return double return the tempoVoo
     */
    public double getTempoVoo() {
        return tempoVoo;
    }

    /**
     * @param tempoVoo the tempoVoo to set
     */
    public void setTempoVoo(double tempoVoo) {
        this.tempoVoo = tempoVoo;
    }

}
