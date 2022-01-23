package application;

import java.util.Locale;
import java.util.Scanner;

import entities.MovContaClass;

public class Conta{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        MovContaClass movConta;
        

        System.out.print("Digite o número da Conta: ");
        int nConta = sc.nextInt();
        
        System.out.print("Digite o nome do Titular: ");
        sc.nextLine();
        String nomeCliente = sc.nextLine();

        System.out.print("Irá fazer depósito? (S/N): ");
        char optDeposito = sc.next().charAt(0);
        System.out.println();
        
        if (optDeposito == 'S' || optDeposito == 's'){
            System.out.print("Digite o valor do Depósito R$: ");
            double valorDeposito = sc.nextDouble();
            movConta = new MovContaClass(nConta, nomeCliente, valorDeposito);
            
            System.out.println();
        }
        else if ((optDeposito == 'N') || (optDeposito == 'n')){
            movConta = new MovContaClass(nConta, nomeCliente);
            System.out.println();
        }
        else{
            System.out.println("Opção Inválida, o valor será considerado como R$ 0.00");
            movConta = new MovContaClass(nConta, nomeCliente);
            System.out.println();
        }

       
        
        System.out.println("===  D A D O S  D A  C O N T A ===");
        System.out.println();

        System.out.println(movConta);
        System.out.println();

        System.out.print("Entre com o valor do Depósito R$: ");
        double valor = sc.nextDouble();
        movConta.deposito(valor);
        System.out.println();


        System.out.println("===  D A D O S  D A  C O N T A ===");
        System.out.println();

        System.out.println(movConta);
        System.out.println();


        System.out.print("Entre com o valor do Saque R$: ");
        valor = sc.nextDouble();
        movConta.saque(valor);
        System.out.println();

        System.out.println("===  D A D O S  D A  C O N T A ===");
        System.out.println();

        System.out.println(movConta);

        sc.close();
    }
}