package models;

public class FuncionarioHorista implements Funcionario {
    //Declarando atributos
    private double totalRecebidoAnual;

    //Construtor da classe
    public FuncionarioHorista(double totalRecebidoAnual) {
        this.totalRecebidoAnual = totalRecebidoAnual;
    }

    //Getter TotalRecebidoAnual
    public double getTotalRecebidoAnual() {
        return totalRecebidoAnual;
    }

    //Override método calcula bônus
    @Override
    public double calcularBonus() {
        return totalRecebidoAnual * 0.10; // 10% do total anual recebido
    }


}
