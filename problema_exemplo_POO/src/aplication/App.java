package aplication;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product x;

        x = new Product();

        System.out.println("Enter product data:");
        System.out.printf("Name: ");
        x.name = sc.nextLine();
        System.out.printf("Price: ");
        x.price = sc.nextDouble();
        System.out.printf("Quantity in stock: ");
        x.quantity = sc.nextInt();

        System.out.println();
        System.out.println("Product data: " + x);

        System.out.printf("Enter the number of products to be added in stock: ");
        
        int quantityAdd = sc.nextInt();

        x.AddProducts(quantityAdd);

        System.out.println();
        System.out.println("Updated data: " + x);

        System.out.printf("Enter the number of products to be removed from stock: ");

        int quantityRemove= sc.nextInt();

        x.RemoveProducts(quantityRemove);

        System.out.println();
        System.out.println("Updated data: " + x);

        sc.close();
    }
}
