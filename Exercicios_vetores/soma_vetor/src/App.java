import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        double sum = 0;

        for (int i = 0; i < vect.length; i++) {
            sum += vect[i];
        }


        System.out.print("Valores =");
        for (int i = 0; i < vect.length; i++) {
            System.out.printf(" %.1f", vect[i]);
        }


        System.out.printf("\nSOMA = %.2f \n", sum);
        System.out.printf("MEDIA = %.2f \n", sum/vect.length);

        sc.close();
    }
}
