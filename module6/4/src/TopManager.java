public class TopManager extends Operator implements Employee{

    private Company company;
    private double income;
    public TopManager(String name, double fixedSalary,Company company)
    {
        super(name,fixedSalary);
        this.company = company;
    }


    @Override
    public double getMonthSalary() {
        this.income = company.getIncome();
       if (this.income > 10000000.00) {
           return getFixedSalary() + (getFixedSalary()/100 * 150);
       } else
        return getFixedSalary() ;
    }
}
