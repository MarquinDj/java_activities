package util;

public class CurrencyConverter {

    public static final double IOF = 1.06;

    public static double reais(double dollar, double amount){
        return dollar * amount * IOF;
    }

}
