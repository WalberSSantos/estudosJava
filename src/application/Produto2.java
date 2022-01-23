package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProdutoClass2;

public class Produto2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com dos dados do Produto:");
        System.out.print("Nome: ");
        String name = sc.nextLine();

        System.out.print("Valor do Produto: ");
        double price = sc.nextDouble();

        System.out.print("Quantidade em Estoque: ");
        int quantity = sc.nextInt();

        ProdutoClass2 produto = new ProdutoClass2(name, price, quantity);

        System.out.println();
        System.out.println(produto);

        System.out.println();
        System.out.print("Digite a quantidade de entrada do Produto: ");
        quantity = sc.nextInt();
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
