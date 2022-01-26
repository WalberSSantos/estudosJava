package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ArraydeObjClass;

public class ArrayDeObj {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de produtos: ");
        int n = sc.nextInt();

        ArraydeObjClass[] prod = new ArraydeObjClass[n];

        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Produto: ");
            String nomeProduto = sc.nextLine();
            System.out.print("Valor R$: ");
            Double valor = sc.nextDouble();
            prod[i] = new ArraydeObjClass(nomeProduto, valor);
            sc.nextLine();
        }

        Double soma = 0.00;
        for (int i = 0; i < n; i++) {

            soma += prod[i].getValor();
        }

        Double media = soma / n;

        System.out.printf("A média dos valores é: %.2f", media);

        sc.close();
    }

}
