public class Manager extends Operator {

    private double earnSalary;
    private double salary;

    public Manager (String name, double fixedSalary, int earnSalary)
    {
        super(name,fixedSalary);
        this.earnSalary = earnSalary;
        this.salary = getFixedSalary() + (earnSalary/100 * 5);
    }

    @Override
    public double getMonthSalary() {
        return this.salary;
    }
}

