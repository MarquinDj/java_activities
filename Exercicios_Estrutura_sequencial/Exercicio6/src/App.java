import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
       

        float A, B, C;

        A = sc.nextFloat();
        B = sc.nextFloat();
        C = sc.nextFloat();
        
        float trianguleArea = (A * C) / 2;
        double circuloArea = (3.14159 * Math.pow(C, 2));
        float trapezusArea = (((A + B) * C)/2);
        double squareArea =  Math.pow(B, 2);
        float rectangleArea = (A * B);
        
        



        System.out.printf("TRIANGULO: %.3f%n", trianguleArea);
        System.out.printf("CIRCULO: %.3f%n", circuloArea);
        System.out.printf("TRAPEZIO: %.3f%n", trapezusArea);
        System.out.printf("QUADRADO: %.3f%n", squareArea);
        System.out.printf("TRIANGULO: %.3f", rectangleArea);
        sc.close();
    }
}
