package javacore.clss;

public class SalariedEmployeeMain {
    public static void main(String[] args) {

        SalariedEmployee salariedEmployee = new SalariedEmployee();

        salariedEmployee.setEmployeeId(123);
        salariedEmployee.setId(12);
        salariedEmployee.setAnnualSalary(120000);

        System.out.println("id : "+salariedEmployee.getId() +", annualSalary : "+salariedEmployee.getAnnualSalary()+" , employeeId : "+salariedEmployee.getEmployeeId());
    }
}
