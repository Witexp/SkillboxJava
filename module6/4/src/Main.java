import java.util.*;

public class Main {
    public static void main(String[] args) {
        Company company_1 = new Company("Компания", 20000000.00);
        for (int i = 0; i < 180; i++)
        {
            int salary = 10000 + (int) (Math.random() * 8000);
            String strName = "Оператор_" + (i + 1);
            company_1.hire(new Operator(strName,salary));
        }

        for (int i = 0; i < 80; i++)
        {
            int earn = (int) (Math.random() * 100000);
            String strName = "Менеджер_" + (i + 1);
            company_1.hire(new Manager(strName,20000,earn));
        }
        for (int i = 0; i < 10; i++)
        {
            int salary = 30000 + (int) (Math.random() * 10000);
            String strName = "Топ_Менеджер_" + (i + 1);
            company_1.hire(new TopManager(strName,salary,company_1));
        }
        System.out.println("Топ 12 сотрудников по зарплате");
        for (Employee top: company_1.getTopSalaryStaff(12))
            System.out.println(top.getMonthSalary());
        System.out.println("30 самых низкооплачиваемых сотрудников");
        for (Employee low: company_1.getLowestSalaryStaff(30))
            System.out.println(low.getMonthSalary());
        System.out.println(company_1.getCountEmployee() + "половина сотрудников "+ company_1.getCountEmployee()/2);
        System.out.println("Удаляем 50 процентов сотрудников");
        double j = company_1.getCountEmployee()/2;
        for (int i = 0; i < j; i++)
            company_1.fire(i);
        System.out.println(company_1.getCountEmployee());
        System.out.println("Топ 12 сотрудников по зарплате");
        for (Employee top: company_1.getTopSalaryStaff(12))
            System.out.println(top.getMonthSalary());
        System.out.println("30 самых низкооплачиваемых сотрудников");
        for (Employee low: company_1.getLowestSalaryStaff(30))
            System.out.println(low.getMonthSalary());
    }
}
