package application;

import java.util.Locale;
import java.util.Scanner;

import entities.FuncionarioClass;


public class Funcionario {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        FuncionarioClass funcionario = new FuncionarioClass();
        
        System.out.println("Controle de Alteração Salarial");
        System.out.println();
        System.out.print("Digite o nome do Funcionário: ");
        funcionario.nome = sc.nextLine();
        System.out.print("Digite o Salário Bruto: ");
        funcionario.salarioBruto = sc.nextDouble();
        System.out.print("Digite Valor do Desconto: ");
        funcionario.desconto = sc.nextDouble();
        System.out.println();

        System.out.println("Funcionário: " + funcionario.nome + " R$ " + funcionario.salarioLiquido());

        System.out.print("Digite o Percentual para Alteração de Salário: ");
        double porcentagem = sc.nextDouble();
        funcionario.salarioIncrementado(porcentagem);
        System.out.println();

        System.out.println(funcionario);

        sc.close();
    }
    
}
