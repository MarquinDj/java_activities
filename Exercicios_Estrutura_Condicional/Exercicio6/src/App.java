import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float value = sc.nextFloat();

        if (0 <= value  && value <= 25 ){
            System.out.println("Intervalo [0,25]");
        }

        else if (25 < value  && value <= 50 ){
            System.out.println("Intervalo (25,50]");
        }

        else if (50 < value  && value <= 75 ){
            System.out.println("Intervalo (50,75]");
        }

        else if (75 < value  && value <= 100 ){
            System.out.println("Intervalo (75,100]");
        }

        else {
            System.out.println("Fora de intervalo");
        }

        sc.close();
    }
}