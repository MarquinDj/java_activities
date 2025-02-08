package application;

import entities.Client;
import entities.Order;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.OrderItem;
import entities.Product;
import entitiesEnum.OrderStatus;


public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter cliente data: ");
        System.out.print("Name:");
        String clientName = sc.nextLine();
        System.out.print("Email: ");
        String clientEmail = sc.nextLine();
        System.out.print("Birth Date (DD/MM/YYYY): ");
        String birthDate = sc.nextLine();

        Client client = new Client(clientName, clientEmail, LocalDate.parse(birthDate, formatter));

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        String status = sc.nextLine();
        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        Order order = new Order(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")), OrderStatus.valueOf(status),client);

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter %d item data \n", i+1);
            System.out.print("product name: ");
            String productName = sc.next();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            Product product = new Product(productName, price);
            OrderItem orderItem = new OrderItem(quantity, price, product);

            order.addItem(orderItem);

        }

        System.out.println(order);
    }
}