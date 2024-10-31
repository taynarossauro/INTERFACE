package models;

public class FuncionarioAssalariado implements Funcionario {
    //Declarando atributos
    private double salarioAnual;

    //Construtor da classse
    public FuncionarioAssalariado(double salarioAnual) {
        this.salarioAnual = salarioAnual;
    }
    
    //Getter Salario Anual
    public double getSalarioAnual() {
        return salarioAnual;
    }    
    
	//Override método que calcula bônus
    @Override
    public double calcularBonus() {
        return 5000.00;
    }


}