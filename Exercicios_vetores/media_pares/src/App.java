import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        int countPar = 0;
        int sumPar = 0;

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Digite um numero: ");
            vect[i] = sc.nextInt();
            
            if (vect[i]%2 == 0){
                countPar += 1;
                sumPar += vect[i];
            }
        }

        if (countPar == 0) {
            System.out.println("NENHUM NUMERO PAR");
        }

        else{
            System.out.printf("MEDIA DOS PARES = %.1f", (double) sumPar/countPar);
        }

        sc.close();
    }
}
