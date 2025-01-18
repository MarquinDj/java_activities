package entities;

public class student {

    public String name;
    public double gradeOne;
    public double gradeTwo; 
    public double gradeThree;

    public double sum(){
        return gradeOne + gradeTwo + gradeThree;
    }

    public String toString() {
        if (sum() > 60.00) {
           return "FINAL GRADE = " + String.format("%.2f", sum()) + "\n" + "PASS";
            
        }

        else{
            return "FINAL GRADE = " + String.format("%.2f", sum()) + "\n" + "FAILED" + "\n" +
            "MISSING " + String.format("%.2f", (60 - sum())) + " POINTS";
        }
    }
}
