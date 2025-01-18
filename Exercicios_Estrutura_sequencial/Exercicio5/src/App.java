import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
       

        int numberP1, quantityP1, numberP2, quantityP2; 
        float priceP1, priceP2;

        numberP1 = sc.nextInt();
        quantityP1 = sc.nextInt();
        priceP1 = sc.nextFloat();
        float resultP1 = (quantityP1 * priceP1);    

        numberP2 = sc.nextInt();
        quantityP2 = sc.nextInt();
        priceP2 = sc.nextFloat();
        float resultP2 = (quantityP2 * priceP2);

        float total = (resultP1 + resultP2);

        System.out.printf("VALOR A PAGAR: R$ %.2f", total);
        sc.close();
    }
}
