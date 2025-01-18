
import java.util.Locale;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char resp;
        

        do {
            System.out.println("Digite a temperatura em Celsius: ");
            double c = sc.nextDouble();
            double F = 9.0 * c / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.2f\n", F);
            System.out.printf("Deseja repetir (s/n)? ");
            resp = sc.next().charAt(0);
        } while (resp != 'n');

        sc.close();
    }
}
