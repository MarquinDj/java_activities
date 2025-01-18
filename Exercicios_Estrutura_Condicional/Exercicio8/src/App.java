
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        float salary = sc.nextFloat();

        if (salary < 2000.0){
            System.out.println("Isento");
        }
        
        else if (salary < 3000.0){
            System.out.printf("R$%.2f", (salary - 1000.00) * 0.08);
        }

        else if (salary < 4500.0){
            System.out.printf("R$%.2f", 1000.00 * 0.08 + (salary - 3000.00) * 0.18);
        }

        else {
            System.out.printf("R$%.2f", 1000.00 * 0.08 + 1500.00 * 0.18 + (salary - 4500.00) * 0.28);
        }

        sc.close();
    }
}
