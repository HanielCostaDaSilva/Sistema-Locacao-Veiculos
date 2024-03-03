package model;

import model.enumClass.TipoMotorizacao;

public class Motor {
    // Atributos
    private TipoMotorizacao tipoMotorizacao;        
    private int cilindrada;     
    private int potencia;       

    public Motor(TipoMotorizacao tipoMotorizacao, int cilindrada, int potencia){
        this.tipoMotorizacao= tipoMotorizacao;
        this.cilindrada= cilindrada;
        this.potencia = potencia;
    }


    /**
     * @return int return the cilindrada
     */
    public int getCilindrada() {
        return cilindrada;
    }

    /**
     * @param cilindrada the cilindrada to set
     */
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    /**
     * @return int return the potencia
     */
    public int getPotencia() {
        return potencia;
    }

    /**
     * @param potencia the potencia to set
     */
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }


    /**
     * @return TipoMotorizacao return the tipoMotorizacao
     */
    public TipoMotorizacao getTipoMotorizacao() {
        return tipoMotorizacao;
    }

    /**
     * @param tipoMotorizacao the tipoMotorizacao to set
     */
    public void setTipoMotorizacao(TipoMotorizacao tipoMotorizacao) {
        this.tipoMotorizacao = tipoMotorizacao;
    }

    public String toString(){
        return " Tipo Motorizacao: " +this.tipoMotorizacao.toString()+ ", Cilindrada: "+ this.cilindrada+ ", Potencia: "+ this.potencia;
    }

}