package corejava.aug07;

public class SalariedEmployeeMain {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee();

        salariedEmployee.setId(123);
        salariedEmployee.setEmployeeId(458);
        salariedEmployee.setAnnualSalary(50000);

        System.out.println("Id :"+salariedEmployee.getId()+" ; Employee Id :"+salariedEmployee.getEmployeeId()+" ;" +
                " AnnualSalary :"+salariedEmployee.getAnnualSalary());
    }
}
