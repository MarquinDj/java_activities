import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float x = sc.nextFloat();
        float y = sc.nextFloat();

        if (x == 0  && y == 0 ){
            System.out.println("ORIGEM");
        }

        else if (x == 0){
            System.out.println("Eixo Y");
        }

        else if (y == 0){
            System.out.println("Eixo X");
        }

        else if (0 < x  && y > 0 ){
            System.out.println("Q1");
        }

        else if (0 > x  && y > 0 ){
            System.out.println("Q2");
        }

        else if ( 0 > x  && y < 0 ){
            System.out.println("Q3");
        }

        else {
            System.out.println("Q4");
        }

        sc.close();
    }
}