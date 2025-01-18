package Aplication;

import entities.Rectangle;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle x;

        x = new Rectangle();

        System.out.println("Enter rectangle width and height:");
        x.width = sc.nextDouble();
        x.height = sc.nextDouble();

        System.out.println(x);

    }
}
