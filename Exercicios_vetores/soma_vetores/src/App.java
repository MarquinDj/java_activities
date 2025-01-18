
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.printf("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();

        int[] vectA = new int[n];
        int[] vectB = new int[n];

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < vectA.length; i++) {
            vectA[i] = sc.nextInt();
            
        }

        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < vectB.length; i++) {
            vectB[i] = sc.nextInt();
            
        }

        System.out.println("Vetor resultante:");

        for (int i = 0; i < n; i++) {
            System.out.print(vectA[i] + vectB[i] + "\n");
            
        }



    }
}
