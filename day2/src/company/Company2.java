package company;

public class Company2 {
    public static void main(String[] args) {
        Employee [] e =  new Employee[3];
        e[0] = new Employee("이사원", 1000.0);
        e[1] = new SalesEmployee("이세일", 500.0, "Seoul", 1000.0);
        e[2] = new SecretaryEmployee("이비서", 800.0, "이보스");

        for(Employee e1 : e){
            System.out.println(e1);
        }
        for(Employee e1 : e){
            System.out.println(e1.getAnnualSalary());
        }
    }
}
