import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for (int i = 1; i <= x; i++) {

            int impar = i % 2;

            if (impar % 2 != 0 && x <= 1000 && x >= 1) {
                System.out.println(i);
            }
           
        }
    
    sc.close();

    }
}
