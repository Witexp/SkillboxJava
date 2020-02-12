public class Operator implements Employee {
    private double fixedSalary;
    private String name;
    public Operator (String name, double fixedSalary)
    {
        this.name = name;
        this.fixedSalary = fixedSalary;
    }
     public String getName() {
        return name;}


    public double getFixedSalary() {

        return fixedSalary;
    }
    public double getMonthSalary() {

        return fixedSalary;
    }
}
