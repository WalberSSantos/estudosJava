package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.FuncionariosClass;

public class Funcionarios {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos funcionários serão registrados?: ");
        int quant = sc.nextInt();

        List<FuncionariosClass> funcRelacao = new ArrayList<>();

        for (int i = 1; i <= quant; i++) {
            System.out.println();

            System.out.println("FUNCIONÁRIO #" + i + ": ");
            System.out.print("Digite o ID do funcionário: ");
            int id = sc.nextInt();

            System.out.print("Digite o Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("Digite o Salário: ");
            Double salario = sc.nextDouble();

            funcRelacao.add(new FuncionariosClass(id, nome, salario));

        }
        System.out.println("=== DIGITE O ID DO FUNCIONÁRIO QUE RECEBERÁ O AUMENTO ===");
        System.out.print("ID nº: ");
        int idPesq = sc.nextInt();

        FuncionariosClass func = funcRelacao.stream().filter(x -> x.getId() == idPesq).findFirst().orElse(null);
        if (func == null) {
            System.out.println("ID não existe");
        } else {
            System.out.print("Digite o Percentual: ");
            int percentual = sc.nextInt();
            func.calcSalario(percentual);
        }

        System.out.println();
        System.out.println("==== LISTA DOS FUNCIONÁRIOS ====");
        for (FuncionariosClass relFunc : funcRelacao) {
            System.out.println(relFunc);
        }

        System.out.println();

        sc.close();
    }

}
