package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CalculoFolha;

public class FolhaPagamento {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        CalculoFolha calculoFolha;

        System.out.println(" === F O L H A  D E  P A G A M E N T O === ");
        System.out.println();

        System.out.print("Digite o Código do Funcionário: ");
        int cod = sc.nextInt();

        System.out.print("Nome: ");
        sc.nextLine();
        String nomeFuncionario = sc.nextLine();

        System.out.print("Salário Bruto R$: ");
        double salarioBruto = sc.nextDouble();
        

        System.out.print("Quantidade de Horas Extras: ");
        int qtHoraExtra = sc.nextInt();
        System.out.println();


        System.out.print("Possui Adicional Noturno (S/N): ");
        char adNoturno = sc.next().charAt(0);

        if (adNoturno == 'S' || adNoturno == 's'){

            calculoFolha = new CalculoFolha(cod, nomeFuncionario, salarioBruto, qtHoraExtra);
            calculoFolha.adNoturno();
           
            System.out.println();
        }
        else{
            calculoFolha = new CalculoFolha(cod, nomeFuncionario, salarioBruto, qtHoraExtra);
        }

        calculoFolha.horaExtra(qtHoraExtra);
        calculoFolha.inss();
        calculoFolha.calcSalarioLiq();


        System.out.println("== D A D O S  D O  S A L Á R I O ==");
        System.out.println();
        System.out.println(calculoFolha);
        sc.close();
    }

    
}
