import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Company {
    private String companyName;
    private double income;
    private ArrayList<Employee> empl;
    private ArrayList<Employee> employeeList;
    private Employee employe;

    public Company(String CompanyName, double income)
    {
        this.companyName = CompanyName;
        this.income = income;
        employeeList = new ArrayList<>();

    }

    public void hire(Employee employe){
       // this.employe = employe;
        employeeList.add(employe);
    }
    public void hireAll(List<Employee> empl){
           employeeList.addAll(empl);
    }
    public void fire(int index){
        employeeList.remove(index);
    }

    public List<Employee> getTopSalaryStaff(int count) {
        List<Employee> topEmplList = new ArrayList<>();
        if (count > this.employeeList.size()) {
            System.out.println("Нет такого колличества сотрудников в организации!!");
            return topEmplList;
        } else {
            Collections.sort(this.employeeList, (o1, o2) -> {
                if (o1.getMonthSalary() < o2.getMonthSalary())
                    return 1;
                if (o1.getMonthSalary() > o2.getMonthSalary())
                    return -1;
                return 0;
            });

            //List<Employee> topEmplList = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                // System.out.println(this.employeeList.get(i).getMonthSalary());
                topEmplList.add(this.employeeList.get(i));
            }
            return topEmplList;
        }
    }
    public List<Employee> getLowestSalaryStaff(int count)
    {
        List<Employee> topEmplList = new ArrayList<>();
        if (count > this.employeeList.size()) {
            System.out.println("Нет такого колличества сотрудников в организации!!");
            return topEmplList;
        } else {
            Collections.sort(this.employeeList, (o1, o2) -> {
                if (o1.getMonthSalary() > o2.getMonthSalary())
                    return 1;
                if (o1.getMonthSalary() < o2.getMonthSalary())
                    return -1;
                return 0;
            });

            for (int i = 0; i < count; i++) {
                topEmplList.add(this.employeeList.get(i));
            }
            return topEmplList;
        }
    }

    public double getIncome()
    {
        return this.income;
    }
    public int getCountEmployee()
    {
        return employeeList.size();
    }

}
