import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double preco = sc.nextDouble();

        double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;

        System.out.print(desconto);
    }
}
