import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
       

        double pi, raio;

        pi = 3.14159;
        raio = sc.nextFloat();
        double area = pi * Math.pow(raio, 2);

        System.out.printf("A = %.4f", area);
        sc.close();
    }
}
