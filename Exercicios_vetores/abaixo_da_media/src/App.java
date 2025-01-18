
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc  = new Scanner(System.in);

        System.out.printf("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        double sum = 0;

        for (int i = 0; i < vect.length; i++) {

            System.out.printf("Digite um numero: ");
            vect[i] = sc.nextDouble();

            sum += vect[i];
            
        }

        double mean = sum / vect.length;

        System.out.printf("MEDIA DO VETOR = %.3f\n", mean);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");

        for (int i = 0; i < vect.length; i++) {

            if (vect[i] <  mean){
                System.out.println(vect[i]);
            }
            
        }

        sc.close();

    }
}
