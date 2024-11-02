package collectin.revision;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class AscComp implements Comparator  <Employee>{
    @Override
    public int compare(Employee employee1, Employee employee2) {
        return Integer.compare(employee1.getId(), employee2.getId());
    }
}
class DesComp implements Comparator  <Employee>{
    @Override
    public int compare(Employee employee1, Employee employee2) {
        return Integer.compare( employee2.getId(), employee1.getId());
    }
}
public class EmployeeRunner {
    public static void main(String[] args) {
        List<Employee> employees = List.of(new Employee(1,"Aameen"), new Employee(32,"Khan"),
                new Employee(20,"Hussain"));
        System.out.println("List Order : "+employees);
        List<Employee> employeeArr = new ArrayList<>(employees);
        employeeArr.sort(new AscComp());
        System.out.println("Ascend Order : "+employeeArr);
        employeeArr.sort(new DesComp());
        System.out.println("Desc Order : "+employeeArr);
    }
}
