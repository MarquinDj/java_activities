import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x  = sc.nextInt();
        double conta = 50.0;

        if ( x > 100) {
           conta += (x - 100.00) * 2;
        }
      
        System.out.printf("Valor a pagar: R$%.2f", conta);

        sc.close();
    }
}
