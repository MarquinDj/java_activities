import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();
        
        for (int i = 0; i < c; i++){

            float v1 = sc.nextFloat();
            float v2 = sc.nextFloat();
            float v3 = sc.nextFloat();

            float mean = ((v1 * 2) + (v2 * 3) + (v3 * 5)) / 10;

            System.out.printf("%.1f\n", mean);
        }

       sc.close();
    }
}
