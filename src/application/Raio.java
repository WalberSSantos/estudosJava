package application;

import java.util.Locale;
import java.util.Scanner;

import entities.RaioClass;

public class Raio {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio: ");
        double raio = sc.nextDouble();  
        System.out.println();

        System.out.printf("Valor da Circunferência: %.2f %n", RaioClass.circunf(raio));
        System.out.printf("Valor do Volume: %.2f %n", RaioClass.volume(raio));
        System.out.printf("Valor do PI: %.2f %n", RaioClass.PI);

        

        sc.close();


    }
    
}
