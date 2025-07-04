package company;

public class SalesEmployee extends Employee {
    // member variable
    // empNo, name, salary
    private String loc;
    private double bonus;
    private SalesEmployee() {

    }
    public SalesEmployee(String name, double salary, String loc, double bonus) {
        super(name, salary);
        this.loc = loc;
        this.bonus = bonus;
    }
    public SalesEmployee(String empNo,String name, double salary, String loc, double bonus) {
        super(name, empNo, salary);
        this.loc = loc;
        this.bonus = bonus;
    }

    public String getLoc() {
        return loc;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return "SaleEmployee{" +
                "empNo=" + super.getEmpNo() +
                ", name=" + super.getName() +
                ", salary=" + super.getSalary() +
                "loc='" + loc + '\'' +
                ", bonus=" + bonus +
                '}';
    }

    public double getAnnualSalary() {
        return super.getSalary()*12 + bonus;

    }
}
