package service;

import model.Aviao;
import model.Carro;
import model.Helicoptero;
import model.Moto;
import model.Onibus;
import model.abstractClass.Veiculo;

public final class CalcularDiaria {

    public static double calcularDiaria(Veiculo veiculo) {
        if (veiculo instanceof Aviao) {
            return calcularDiaria((Aviao) veiculo);
        } 
        else if (veiculo instanceof Carro) {
            return calcularDiaria((Carro) veiculo);
        } 
        else if (veiculo instanceof Moto) {
            return calcularDiaria((Moto) veiculo);
        } 
        else if (veiculo instanceof Onibus) {
            return calcularDiaria((Onibus) veiculo);
        } 
        else if (veiculo instanceof Helicoptero) {
            return calcularDiaria((Helicoptero) veiculo);
        } 
        else {
            throw new IllegalArgumentException("Tipo de veículo não suportado para cálculo de diária");
        }
    }

    private static double calcularDiaria(Aviao aviao) {
        return 0.2 * aviao.getValorCompra() + 1000 * aviao.getVelocidadeCruzeiro();
    }

    private static double calcularDiaria(Carro carro) {
        return carro.getValorCompra() * 0.02;
    }

    private static double calcularDiaria(Moto moto) {
        double valorSisPartida = (moto.getPartida().name().equals("MANUAL") ? 5.0 : 20.0);
        return (0.02 * moto.getValorCompra()) + valorSisPartida;
    }

    private static double calcularDiaria(Onibus onibus) {
        return (onibus.getQuantPassageiro() * 100) + (0.04 * onibus.getValorCompra());
    }

    private static double calcularDiaria(Helicoptero helicoptero) {
        return helicoptero.getQuantRotores() * (0.1 * helicoptero.getValorCompra());
    }
}
