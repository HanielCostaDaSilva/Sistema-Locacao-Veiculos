package repository;

import java.util.ArrayList;
import java.util.List;

import model.abstractClass.Veiculo;

public class VeiculoRepositorio {
    private List<Veiculo> veiculos = new ArrayList<>();

    public void adicionar(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public List<Veiculo> listar() {
        return new ArrayList<>(veiculos);
    }

    /*
     * Recebe o id de um veículo
     * Retorna o veiculo se encontrà-lo
     * Caso não encontre, retorna uma exception
     */
    public Veiculo localizar(int id) throws Exception {

        if (id < 0 || id > this.veiculos.size()) {
            throw new Exception("Id inserido é inválido");
        }

        return this.veiculos.get(id - 1);

    }

    public String mostrarVeiculos() {
        String s ="";
        for(Veiculo v : veiculos){
            s += "\n------------\n"+ v + "\n eh um "+ v.getClass().getSimpleName()+"\n------------\n";
        }
        if(s.isEmpty()) s ="Sem veículos";
        return s;

    }

    public int tamanho(){
        return this.veiculos.size();
    }

    /*Procura o veículo com a maior diária registrada */
    public Veiculo localizarVeiculoMaiorDiaria() throws Exception{
        if(this.veiculos.isEmpty()) throw new Exception("Sem veiculos"); 
        
        Veiculo veiculoMaiorDiaria = this.veiculos.get(0);

        if(this.veiculos.size()==1) return veiculoMaiorDiaria;

        double maiorDiaria = veiculoMaiorDiaria.calcularDiaria();

        for(Veiculo v : veiculos){

            double diariaComparar = v.calcularDiaria();
            if (maiorDiaria < diariaComparar){
                veiculoMaiorDiaria = v;
                maiorDiaria = diariaComparar;

            }
        }

        return veiculoMaiorDiaria;

    }

    public <T extends Veiculo> List<T> gerarListaPorTipo(Class<T> tipo) {
        List<T> listaPorTipo = new ArrayList<>();
        for (Veiculo veiculo : this.veiculos) {
            if (tipo.isInstance(veiculo)) {
                listaPorTipo.add(tipo.cast(veiculo));
            }
        }
        return listaPorTipo;
    }

}