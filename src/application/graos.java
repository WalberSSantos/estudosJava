package application;

import java.util.Scanner;

public class graos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double calc = 0, graos = 1;

        for(int i = 1; i <= 64; i++){
            System.out.printf("Casa: %d Grãos: %.0f %n", i, graos);
            /* System.out.printf("Casa: " + i + " Grãos: " + graos); */
            calc = graos * 2;
            graos = calc ;
        }
        sc.close();
    }
}
