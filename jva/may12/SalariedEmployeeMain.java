package jva.may12;
// encapsulation
public class SalariedEmployeeMain {

    public static void main(String[] args) {

        SalariedEmployee salariedEmployee = new SalariedEmployee();

        salariedEmployee.setEmployeeId(12340);
        salariedEmployee.setAnnualSalary(2000000);
        salariedEmployee.setId(45);

        salariedEmployee.display();
    }
}
