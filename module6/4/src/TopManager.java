public class TopManager extends Operator implements Employee{

    private Company company;
    private double income;
    private double salary;
    public TopManager(String name, double fixedSalary,Company company)
    {
        super(name,fixedSalary);
        this.company = company;
        this.income = company.getIncome();
        if (this.income > 10000000.00) {
            this.salary = getFixedSalary() + (getFixedSalary()/100 * 150);
        } else
            this.salary = getFixedSalary();
    }


    @Override
    public double getMonthSalary() {

        return this.salary ;
    }
}
