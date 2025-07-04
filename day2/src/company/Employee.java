package company;

import java.util.UUID;

public class Employee {
    private String name;
    private String empNo;
    private double salary;

    public Employee() {

    }

    public Employee(String name, double salary) {
        this.empNo = UUID.randomUUID().toString();
        this.name = name;
        this.salary = salary;
    }

    public Employee(String name, String empNo, double salary) {
        this.name = name;
        this.empNo = empNo;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getEmpNo() {
        return empNo;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNo='" + empNo + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
    public double getAnnualSalary() {
        return salary*12;
    }
    public double getAnnualSalary(double taxRate) {
        return (salary*12) - (salary * 12 * taxRate);
    }
}
