public class Manager extends Operator {

    private double earnSalary;

    public Manager (String name, double fixedSalary, int earnSalary)
    {
        super(name,fixedSalary);
        this.earnSalary = earnSalary;
    }

    @Override
    public double getMonthSalary() {
        return getFixedSalary() + (earnSalary/100 * 5);
    }
}

