import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
       

        int number, hours; 
        float per_hour;

        number = sc.nextInt();
        hours = sc.nextInt();
        per_hour = sc.nextFloat();

        float salary = (hours * per_hour);

        System.out.printf("NUMBER = %d\n", number);
        System.out.printf("SALARY = U$ %.2f", salary);
        sc.close();
    }
}
