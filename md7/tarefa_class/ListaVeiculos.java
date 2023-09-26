/**
 * @author phtech
*/


public class ListaVeiculos {
    //métido que não retorna valor (void)
    public void saudacao() {
        System.out.println("Olá, seja bem vindo ao Lista de Veículos");
    }
    //método que recebe parâmetro e retorna um valor
    public String modeloVeiculo(String modelo) {
        return modelo;
    }

    public int anoVeiculo(int ano) {
        return ano;
    }

    public static void main(String[] args) {
        ListaVeiculos lista = new ListaVeiculos();

        lista.saudacao();

        String modeloVeiculo = lista.modeloVeiculo("Ford Ranger");
        System.out.println("O modelo do veículo é: " + modeloVeiculo);

        int anoVeiculo = lista.anoVeiculo (2023);
        System.out.println("O ano é: " + anoVeiculo);

    }
}