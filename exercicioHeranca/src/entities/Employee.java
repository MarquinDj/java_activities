package entities;

public class Employee {
    private String name;
    private Integer Hours;
    private Double valuePerHour;

    public Employee() {
    }

    public Employee(Integer hours, String name, Double valuePerHour) {
        Hours = hours;
        this.name = name;
        this.valuePerHour = valuePerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return Hours;
    }

    public void setHours(Integer hours) {
        Hours = hours;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Double payment(){
        return Hours * valuePerHour;
    }
}


