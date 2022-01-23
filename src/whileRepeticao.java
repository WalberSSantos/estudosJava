import java.util.Scanner;

public class whileRepeticao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        int soma = 0;
        while (n != 0){
            System.out.println("O número digitado foi: " + n);
            soma += n;
            System.out.print("Digite o próximo número: ");
            n = sc.nextInt();            
        }
        System.out.println("O total dos números digitados foi: " + soma);        

        for (int nSeq = 10; nSeq > 0; nSeq--){
            System.out.println("Contagem: " + nSeq);
        }
        sc.close();
    }
}
