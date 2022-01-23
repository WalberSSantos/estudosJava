import java.util.Locale;
import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        /*
         * int n1; int n2; int soma; System.out.print("Digite o Primeiro valor: "); n1 =
         * sc.nextInt(); System.out.print("Digite o Segundo valor: "); n2 =
         * sc.nextInt(); soma = n1+n2; System.out.println("O total da soma é: " + soma);
         * System.out.println(); System.out.println();
         * System.out.print("Vamos agora brincar com o valor da área do círculo");
         * System.out.println(); double area; double pi = 3.14159; double raio;
         * System.out.print("Digite o valor do raio: "); raio = sc.nextDouble(); area =
         * pi * Math.pow(raio,2); System.out.printf("Área Total de: %.4f %n", area);
         */
        /*
         * int a, b, c, d, dif; System.out.print("Digite Valor 01: "); a = sc.nextInt();
         * System.out.print("Digite Valor 02: "); b = sc.nextInt();
         * System.out.print("Digite Valor 03: "); c = sc.nextInt();
         * System.out.print("Digite Valor 04: "); d = sc.nextInt();
         * 
         * dif = (a * b) - (c * d); System.out.println("A diferença é: " + dif);
         */

        /*
         * int cod; double horasTrabalhadas, valorPorHora, totalSalario;
         * 
         * System.out.print("Digite o Código do Funcionário: "); cod = sc.nextInt();
         * System.out.print("Digite quantidade das horas trabalhadas: ");
         * horasTrabalhadas = sc.nextDouble();
         * System.out.print("Digite o valor por horas trabalhadas: "); valorPorHora =
         * sc.nextDouble();
         * 
         * totalSalario = horasTrabalhadas * valorPorHora;
         * 
         * System.out.
         * printf("Código do Funcionário: %d - Quantidade de Horas: %.0f, Total a Receber R$ %.2f %n"
         * , cod, horasTrabalhadas, totalSalario);
         */

        /*
         * int codPeca1, quantPeca1, codPeca2, quantPeca2; double valorUnit1,
         * totalPeca1, valorUnit2, totalPeca2, totalGeral;
         * 
         * System.out.print("Digite o Código da Peça 01: "); codPeca1 = sc.nextInt();
         * System.out.print("Digite a Quantidade da Peça 01: "); quantPeca1 =
         * sc.nextInt(); System.out.print("Digite o Valor Unitário da Peça 01: ");
         * valorUnit1 = sc.nextDouble(); totalPeca1 = quantPeca1 * valorUnit1;
         * 
         * System.out.print("Digite o Código da Peça 02: "); codPeca2 = sc.nextInt();
         * System.out.print("Digite a Quandiade da Peça 02: "); quantPeca2 =
         * sc.nextInt(); System.out.print("Digite o Valor Unitário da Peça 02: ");
         * valorUnit2 = sc.nextDouble(); totalPeca2 = quantPeca2 * valorUnit2;
         * 
         * totalGeral = totalPeca1 + totalPeca2;
         */

        /*
         * System.out.print("Digite os dados do Produto 01: "); codPeca1 = sc.nextInt();
         * quantPeca1 = sc.nextInt(); valorUnit1 = sc.nextDouble(); totalPeca1 =
         * quantPeca1 * valorUnit1;
         * 
         * System.out.print("Digite os dados do Produto 02: "); codPeca2 = sc.nextInt();
         * quantPeca2 = sc.nextInt(); valorUnit2 = sc.nextDouble(); totalPeca2 =
         * quantPeca2 * valorUnit2;
         * 
         * totalGeral = totalPeca1 + totalPeca2;
         * 
         * System.out.printf("Valor a Pagar: %.2f", totalGeral);
         */
        sc.close();
    }

}
