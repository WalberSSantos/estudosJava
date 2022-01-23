import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        /*
        int n1;
        int n2;

        

        
         * System.out.
         * print("Digite um número para saber se é negativo ou não negativo: "); n1 =
         * sc.nextInt(); n2 = sc.nextInt();
         * 
         * if (n1 < 0) { System.out.println("Número Negativo"); } else {
         * System.out.println("Número Não Negativo"); }
         * 
         * if (n1 % 2 == 0) { System.out.println("O número é: Par"); } else {
         * System.out.println("O número é: Impar"); }
         * 
         * if (n1 % n2 == 0 || n2 % n1 == 0) { System.out.println("São Múltiplos"); }
         * else { System.out.println("Não São Múltiplos"); }
         * 
         * int horaInicial, horaFinal, duracao;
         * System.out.print("Digite o Horário Inicial da Partida: "); horaInicial =
         * sc.nextInt(); System.out.print("Digite o Horário Final da Partida: ");
         * horaFinal = sc.nextInt();
         * 
         * if (horaInicial < horaFinal) { duracao = horaFinal - horaInicial; } else {
         * duracao = 24 - horaInicial + horaFinal; }
         * 
         * System.out.println("A partida durou " + duracao + " horas");
         * 
         * // Exercício 05
         * 
         * int codProd, qtProd; double valorUnitProd, valorTotal; String prod;
         * 
         * System.out.print("Digite o código do Produto: "); codProd = sc.nextInt();
         * System.out.print("Digite a quantidade do Produto: "); qtProd = sc.nextInt();
         * System.out.print("Digite o nome do Produto: "); prod = sc.next(); sc.next();
         * System.out.print("Digite o valor unitário do Produto: "); valorUnitProd =
         * sc.nextDouble();
         * 
         * valorTotal = qtProd * valorUnitProd;
         * 
         * System.out.
         * printf("Código do produto %d, quantidade %d, produto %s valor total R$ é %.2f"
         * , codProd, qtProd, prod, valorTotal);
         */

        double nP;
        System.out.print("Digite um número: ");
        ;
        nP = sc.nextDouble();
        if (nP <= 25) {
            System.out.println("Intervalo entre [0, 25]");
        } else if (nP <= 50) {
            System.out.println("Intervalo entre [25,50]");
        } else if (nP <= 75) {
            System.out.println("Intervalo entre [50,75]");
        } else if (nP <= 100) {
            System.out.println("Intervalo entre [75,100]");
        } else {
            System.out.println("Fora do intervalo");
        }

        sc.close();

    }

}