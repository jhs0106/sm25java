package company;

public class Company {
    public static void main(String[] args) {
        Employee e = new Employee("이사원", 1000.0);
        SalesEmployee se = new SalesEmployee("이세일", 500.0, "Seoul", 1000.0);
        SecretaryEmployee sc = new SecretaryEmployee("이비서", 800.0, "이보스");
        System.out.println(e);
        System.out.println(se);
        System.out.println(sc);

        System.out.println(e.getAnnualSalary());
        System.out.println(se.getAnnualSalary());
        System.out.println(sc.getAnnualSalary());
    }
}
