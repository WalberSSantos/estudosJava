package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProdutoClass;

public class Produto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ProdutoClass produto = new ProdutoClass();

        System.out.println("Entre com dos dados do Produto:");
        System.out.print("Nome: ");
        produto.name = sc.nextLine();

        System.out.print("Valor do Produto: ");
        produto.price = sc.nextDouble();

        System.out.print("Quantidade em Estoque: ");
        produto.quantity = sc.nextInt();

        System.out.println();
        System.out.println(produto);

        System.out.println();
        System.out.print("Digite a quantidade de entrada do Produto: ");
        int quantity = sc.nextInt();
        produto.AddProducts(quantity);

        System.out.println();
        System.out.println(produto);

        System.out.println();
        System.out.print("Digite a quantidade de retirada do Produto: ");
        quantity = sc.nextInt();
        produto.RemoveProducts(quantity);

        System.out.println();
        System.out.println(produto);

        sc.close();

    }

}
