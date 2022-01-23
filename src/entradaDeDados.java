import java.util.Scanner;

public class entradaDeDados {
    public static void main(String[] args) {
        String nome;
        int idade;
        double salario;
        String obsServico;

       Scanner sc = new Scanner(System.in);
       nome = sc.next();
       idade = sc.nextInt();
       salario = sc.nextDouble();

       System.out.printf("Você digitou: %s que tem %d e recebe %.2f %n", nome, idade, salario);
       System.out.print("Digite a observação do serviço: ");
       sc.nextLine();
       obsServico = sc.nextLine();
       System.out.println(obsServico);
       sc.close();


        
    }
    
}
