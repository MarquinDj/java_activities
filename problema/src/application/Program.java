package application;

import entities.Triangle;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;

        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double area_x = x.area();
        double area_y = y.area();

        System.out.printf("Triangle X area: %.4f\n", area_x);
        System.out.printf("Triangle Y area: %.4f\n", area_y);

        if (area_x > area_y) {
            System.out.println("Larger area: X");
        }

        else{
            System.out.println("Larger area: Y");
        }
        
        sc.close();
    }

}
