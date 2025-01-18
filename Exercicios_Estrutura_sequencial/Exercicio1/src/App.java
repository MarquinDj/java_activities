import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int v1, v2;

        v1 = sc.nextInt();
        v2 = sc.nextInt();

        int resultado = v1 + v2; 
        
        System.out.printf("Soma = %d", resultado);
        sc.close();
    }
}
