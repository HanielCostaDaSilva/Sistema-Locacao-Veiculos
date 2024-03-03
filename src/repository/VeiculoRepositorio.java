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
}