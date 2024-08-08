package corejava.aug07;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setId(124);
        employee.setEmployeeName("Aameen Hussain");
        employee.setDateHired("07 August 24");
        employee.setCityId("Kolkata");

        System.out.println("Id :"+employee.getId()+" ; Employee Name :"+employee.getEmployeeName()+" ; " +
                "Date Hired on :"+employee.getDateHired()+" ; City id :"+employee.getCityId());


    }
}
