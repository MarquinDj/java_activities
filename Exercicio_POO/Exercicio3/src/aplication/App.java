package aplication;

import entities.student;
import java.util.Locale;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        student x;

        x = new student();

        x.name = sc.nextLine();
        x.gradeOne = sc.nextDouble();
        x.gradeTwo = sc.nextDouble();
        x.gradeThree = sc.nextDouble();

        System.out.println(x);

        sc.close();
    }
}
