import java.util.Locale;
import java.util.Scanner;

public class exer01 {
    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int cod = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.23456;

        Scanner sc = new Scanner(System.in);
        System.out.println("Products: ");
        System.out.printf("%s, which price is $ %.2f %n", product1, price1);
        System.out.printf("%s, which price is $ %.2f ", product2, price2);
        System.out.println();
        System.out.println();
        System.out.printf("%d years old, code %d and gender: %s", age, cod, gender);
        System.out.println();
        System.out.println();
        System.out.printf("Measue with 8 decimal places: %.8f %n", measure);
        System.out.printf("Rouded (3 decimal places): %.3f %n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f", measure);
       sc.close();
        
    }
    
}
