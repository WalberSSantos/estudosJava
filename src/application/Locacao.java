package application;

import java.util.Scanner;

import entities.LocacaoClass;

public class Locacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LocacaoClass[] loc = new LocacaoClass[10];

        System.out.print("Digite o número de Hospedagens: ");
        Integer n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.print("Nome do Hospede: ");
            String nome = sc.nextLine();

            System.out.print("E-mail: ");
            String email = sc.nextLine();

            System.out.print("Número do Quarto: ");
            Integer nQuarto = sc.nextInt();

            loc[nQuarto] = new LocacaoClass(nome, email, nQuarto);
        }

        System.out.println();
        System.out.println("Relação dos Quartos Locados");
        System.out.println();

        for (int i = 0; i < 10; i++) {
            if (loc[i] != null) {
                System.out.println("Quarto nº: " + i + ": " + loc[i]);

            }
        }

        System.out.println("==============================");

        for (LocacaoClass vetor :  loc){
            System.out.println(vetor);
        }

        sc.close();
    }
}
