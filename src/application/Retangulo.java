package application;

import java.util.Locale;
import java.util.Scanner;

import entities.RetanguloClass;

public class Retangulo {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        RetanguloClass areaRetangulo = new RetanguloClass();

        System.out.println("Entre com a largura e altura do retângulo");
        areaRetangulo.larg = sc.nextDouble();
        areaRetangulo.alt = sc.nextDouble();
        System.out.println();

        System.out.println("Área total: " + String.format("%.2f", areaRetangulo.area()));
        
        System.out.println("Perímetro: " +  String.format("%.2f",areaRetangulo.perimetro()));
        System.out.println("Diagonal: " + String.format("%.2f",areaRetangulo.diagonal()));

        sc.close();
    }
    
}
