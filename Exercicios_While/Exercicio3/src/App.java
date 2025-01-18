
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        int x = sc.nextInt();

        while (x != 4 ) { 
            switch (x) {
                case 1 -> alcool += 1;
                case 2 -> gasolina += 1;
                case 3 -> diesel += 1;
                default -> {
                }
            }
            x = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d\n", alcool);
        System.out.printf("Gasolina: %d\n", gasolina);
        System.out.printf("Diesel: %d\n", diesel);

        sc.close();
    }
}
