package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BoletimClass;

public class Boletim {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        BoletimClass boletimClass = new BoletimClass();

        System.out.println("=== B O L E T I M  E S C O L A R ===");
        System.out.println();

        System.out.print("Digite o nome do(a) aluno(a): ");
        boletimClass.nome = sc.nextLine();
        System.out.println("Digite as 03 notas do(a) aluno(a): ");
        boletimClass.nota1 = sc.nextDouble();
        boletimClass.nota2 = sc.nextDouble();
        boletimClass.nota3 = sc.nextDouble();
        System.out.println();

        System.out.println("Média Final: " + boletimClass.media());

        if (boletimClass.media() < 60.0){
            System.out.println("Não Foi Aprovado(a)");
            System.out.print("Pontos faltantes: " + boletimClass.diferenca());
        }
        else{
            System.out.println("Foi Aprovado(a)");
        }
        sc.close();
    }
    
}
