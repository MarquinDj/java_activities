package entities;

public class Bank {

    private String name;
    private int number;
    private double balance;

    public Bank(String name, int number, double inicialDeposit) {
        this.name = name;
        this.number = number;
        deposit(inicialDeposit);
    }

    public Bank(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public void inicialDeposit(double inicial){
        balance += inicial;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public double getbalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void deposit(double deposit){
        balance += deposit;
    }

    public void withdraw(double withdraw){
        balance -= withdraw + 5;
    }

    public String toString(){
        return "Account " + number + ", Holder: " + name + ", Balance: $ " + balance;
    }


}
