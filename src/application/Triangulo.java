package application;
import java.util.Locale;
import java.util.Scanner;

import entities.TrianguloClass;

public class Triangulo {
    public static void main(String[] args) {
       
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        TrianguloClass x, y;
        
        x = new TrianguloClass();
        y = new TrianguloClass();
    
        System.out.println("Entre com o tamanho do triângulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
            
        System.out.println("Entre com o tamanho do triângulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        
        double areaY = y.area();

        System.out.printf("Área do Triângulo X: %.4f%n", areaX);
        System.out.printf("Área do Triângulo Y: %.4f%n", areaY);

        if (areaX > areaY){
            System.out.println("A maior área é a do Triângulo X");
        }else{
            System.out.println("A maior área é a do Triângulo Y");
        }
        
        sc.close();

    }

}
