package application;

import java.util.Locale;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Integer n;
        
        double soma = 0, media = 0;
        
        System.out.print("Digite a quantidade de pessoas: ");
        n = sc.nextInt();
        Double nota[] = new Double[n];
        
        for(int i = 0; i<3; i++){
            System.out.print("Participante: " + i + " Altura: ");
            nota[i] = sc.nextDouble();
            soma += nota[i];
        }
        media = soma/n;

        System.out.printf("Média dos %d participantes - %.2f", n, media);

        sc.close();
    } 
}
