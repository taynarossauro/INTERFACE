package main;
import models.*;

public class Main {
    public static void main(String[] args) {
        //  Intancia funcionário assalariado
        FuncionarioAssalariado funcionarioAssalariado1 = new FuncionarioAssalariado(12000.00);
        System.out.println("Funcionário assalariado: \nBônus: R$ " + funcionarioAssalariado1.calcularBonus() + "\n");

        // Instancia funcionário Horista
        FuncionarioHorista funcionarioHorista1 = new FuncionarioHorista(4589.90);
        System.out.println("Funcionário Horista: \n Bônus: " + funcionarioHorista1.calcularBonus());
    }
}