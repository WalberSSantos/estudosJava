package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ConverterDolarClass;

public class ConverssorDolar {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual é o valor do dólar?: ");
        double valorDoDollar = sc.nextDouble();
        System.out.print("Quantos Dólares serão Comprados?: ");
        double montante = sc.nextDouble();
        System.out.println();
        double resultado = ConverterDolarClass.converterDolar(valorDoDollar, montante);

        System.out.printf("Valor a ser pago em R$: %.2f",  resultado);


        sc.close();

    }
    
}
