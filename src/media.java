import java.util.Locale;
import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y, media;
        int idade = 35;
        String nome = "Walber";
        double salario = 1700.50;

        System.out.print("Digite o primeiro número: ");
        x = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        y = sc.nextDouble();
        media = (x + y)/2.0;
        System.out.printf("Média = " + "%.4f%n", media);
        Locale.setDefault(Locale.US);
        System.out.printf("Média = " + "%.4f%n", media);
        System.out.printf("Funcionário %s tem %d anos e recebe R$ %.2f reais!%n", nome, idade, salario);
        sc.close();
    }
}
