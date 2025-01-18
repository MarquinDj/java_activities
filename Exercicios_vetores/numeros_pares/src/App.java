import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números voce vai digitar? ");

        int n = sc.nextInt();

        int[] vect = new int[n]; 

        int count = 0;

        for (int i = 0; i < vect.length; i++) {
            
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();

            if (vect[i] % 2 == 0) {
                count++;
            }

        }

        System.out.println("Numeros pares: ");

        for (int i = 0; i < vect.length; i++) {

            if (vect[i] % 2 == 0) {
                System.out.printf("%d  ", vect[i]);;
            }
            
        }

        System.out.printf("\nQUANTIDADE DE PARES = %d", count);
        
        sc.close();
    }
}
