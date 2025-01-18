import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int code = sc.nextInt();
        int quantity = sc.nextInt();

        if ( code == 1 ){
            System.out.printf("TOTAL: R$ %.2f", 4.00 * quantity);
        }

        else if (code == 2){
            System.out.printf("TOTAL: R$ %.2f", 4.50 * quantity);
        }

        else if (code == 3){
            System.out.printf("TOTAL: R$ %.2f", 5.00 * quantity);
        }

        else if (code == 4){
            System.out.printf("TOTAL: R$ %.2f", 2.00 * quantity);
        }

        else {
            System.out.printf("TOTAL: R$ %.2f", 1.50 * quantity);
        }

        sc.close();
    }
}
