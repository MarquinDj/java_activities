package entities;

public class Student {

    private String name;
    private double g1;
    private double g2;

    public Student(String name, double g1, double g2) {
        this.name = name;
        this.g1 = g1;
        this.g2 = g2;
        
    }

    public String getName() {
        return name;
    }

    public double getG1() {
        return g1;
    }

    public double getG2() {
        return g2;
    }

    
}
