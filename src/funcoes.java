import java.util.Scanner;

public class funcoes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 3 número: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int maiorNumero = max(a, b, c);

        mostraResultado(maiorNumero);
        
        sc.close();
        
    }

    public static int max(int a, int b, int c) {

        int result;
        if(a > b && a > c){
            result = a;
        }else if (b > c){
            result = b;
        }else{
            result = c;
        }
        return result;
    }

    public static void mostraResultado(int maxNumero){
        System.out.println("O maior número é o: " + maxNumero);
    }
    
}
