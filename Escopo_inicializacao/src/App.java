public class App {
    public static void main(String[] args) throws Exception {

        double price = 400.00;
        
        double discount = (price > 200.00) ? price * 0.1 : 0;


        System.out.println(discount);
    }
}
