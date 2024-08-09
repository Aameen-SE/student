package corejava.aug08;

public class HourlEmployeeMain {
    public static void main(String[] args) {
        HourlyEmployee hourlyEmployee = new HourlyEmployee();

        hourlyEmployee.setId(123);
        hourlyEmployee.setEmployeeId(452);
        hourlyEmployee.setAnnualSalary(25000);

        System.out.println("Id :"+hourlyEmployee.getId() +" ; EmployeeId :"+hourlyEmployee.getEmployeeId()+" ; " +
                "AnnualSalary :"+hourlyEmployee.getAnnualSalary());

    }
}
