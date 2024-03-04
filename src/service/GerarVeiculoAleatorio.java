package service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

import model.Aviao;
import model.Carro;
import model.Helicoptero;
import model.Moto;
import model.Motor;
import model.Onibus;
import model.enumClass.TipoMotorizacao;
import model.enumClass.TipoPartida;

public class GerarVeiculoAleatorio {
    private static final Random random = new Random();

    public static Aviao gerarAviao() {
        return new Aviao(
                gerarDoubleAleatorio(100000, 500000),
                gerarDoubleAleatorio(0, 400),
                gerarInteiroAleatorio(100, 500)

        );

    }

    public static Carro gerarCarro() {
        Motor motor = gerarMotor();
        return new Carro(
                gerarDoubleAleatorio(20000, 50000),
                motor,
                "XX11X1",
                gerarInteiroAleatorio(10, 40));
    }

    public static Helicoptero gerarHelicoptero() {
        return new Helicoptero(
                gerarDoubleAleatorio(30000, 100000),
                gerarDoubleAleatorio(0, 120),
                gerarInteiroAleatorio(2, 6));
    }

    public static Moto gerarMoto() {
        // Escolhe um valor aleatório do enum
        TipoPartida partida = TipoPartida.values()[random.nextInt(TipoPartida.values().length)];

        Motor motor = gerarMotor();

        return new Moto(
                gerarDoubleAleatorio(5000, 15000),
                motor,
                "XXXX111",
                partida);
    }

    public static Onibus gerarOnibus() {
        Motor motor = gerarMotor();

        return new Onibus(
                gerarDoubleAleatorio(50000, 200000),
                motor,
                "XXXX111",
                gerarInteiroAleatorio(32, 60));
    }

    private static Motor gerarMotor() {
        TipoMotorizacao[] motorizacoes = TipoMotorizacao.values();
        int index = random.nextInt(motorizacoes.length);

        TipoMotorizacao motorizacao = motorizacoes[index];

        return new Motor(
                motorizacao,
                gerarInteiroAleatorio(100, 400),
                gerarInteiroAleatorio(140, 300));
    }

    private static double gerarDoubleAleatorio(double min, double max) {
        double valor = min + (max - min) * random.nextDouble();

        // Arredonda para duas casas decimais usando BigDecimal
        BigDecimal bd = new BigDecimal(valor).setScale(2, RoundingMode.HALF_UP);
        valor = bd.doubleValue();

        return valor;
    }

    private static int gerarInteiroAleatorio(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }


}
