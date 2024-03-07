package model.abstractClass;

public abstract class Veiculo {

    private static int incrementalId = 1;

    protected int id;
    protected double valorCompra;

    protected Veiculo(double valorCompra) {
        this.id = incrementalId++;
        this.valorCompra = valorCompra;

    }

    public abstract double calcularDiaria();

    public String toString() {
        return "veiculo "+ id + ":\n Valor: " + valorCompra ;
    }

    public boolean equals(Veiculo outroVeiculo) {
        return id == outroVeiculo.id;
    }

    /**
     * @return int return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return double return the valorCompra
     */
    public double getValorCompra() {
        return valorCompra;
    }


}