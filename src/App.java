import java.util.Scanner;

import model.Carro;
import model.Aviao;
import model.Helicoptero;
import model.Moto;
import model.Onibus;
import model.abstractClass.Veiculo;
import repository.VeiculoRepositorio;
import service.CalcularDiaria;
import service.GerarVeiculoAleatorio;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        VeiculoRepositorio repositorio = new VeiculoRepositorio();

        while (true) {
            exibirMenu();
            int opcao = lerOpcao();

            switch (opcao) {
                case 1:
                    Aviao a = GerarVeiculoAleatorio.gerarAviao();
                    repositorio.adicionar(a);
                    break;
                case 2:
                    Carro c = GerarVeiculoAleatorio.gerarCarro();
                    repositorio.adicionar(c);
                    break;
                case 3:
                    Helicoptero h = GerarVeiculoAleatorio.gerarHelicoptero();
                    repositorio.adicionar(h);
                    break;
                case 4:
                    Moto m = GerarVeiculoAleatorio.gerarMoto();
                    repositorio.adicionar(m);
                    break;
                case 5:
                    Onibus o = GerarVeiculoAleatorio.gerarOnibus();
                    repositorio.adicionar(o);
                    break;
                case 6:
                    String veiculosMostrados = repositorio.mostrarVeiculos();
                    System.out.println(veiculosMostrados);
                    break;
                case 7:
                    System.out.println("Digite o ID do veículo");
                    int idBuscado = lerID();
                    try {
                        Veiculo v = repositorio.localizar(idBuscado);
                        System.out.println("o preço da diária é: R$ " + CalcularDiaria.calcularDiaria(v));
                    } catch (Exception e) {

                        System.err.println("Não foi possível calcular a diaria,\n ocorreu o seguinte erro: ");
                        System.err.println(e.getMessage());
                    }
                    break;

                case 0:
                    System.out.println("Saindo do programa.");
                    System.exit(0);
                    break;

                case 8:
                    System.out.println("quantidade de veiculos: " + repositorio.tamanho());
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");

            }
/*             System.out.println("Continuar....");
            scanner.next();
 */        }
    }

    private static void exibirMenu() {
        System.out.println("Menu:");
        System.out.println("1. Adicionar Avião");
        System.out.println("2. Adicionar Carro");
        System.out.println("3. Adicionar Helicóptero");
        System.out.println("4. Adicionar Moto");
        System.out.println("5. Adicionar Ônibus");
        System.out.println("6. Listar Veiculos");
        System.out.println("7. Calcular Diaria por ID");
        System.out.println("8. Quantidade de veiculos cadastrados");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static int lerOpcao() {
        String opcao = scanner.next();

        return Integer.parseInt(opcao);

    }

    private static int lerID() {
        String ID = scanner.next();

        return Integer.parseInt(ID);
    }
}
