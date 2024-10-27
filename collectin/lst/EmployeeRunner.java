package collectin.lst;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescEmployee implements Comparator<Employee>{
    @Override
    public int compare(Employee employee1, Employee employee2) {
        return Integer.compare(employee2.getId(),employee1.getId());
    }
}
public class EmployeeRunner {
    public static void main(String[] args) {
        List<Employee> employees= List.of(new Employee(1,"Aameen"),
                new Employee(23,"Adil") , new Employee(4,"Khan"));

        System.out.println("List of employee : "+employees);

        ArrayList<Employee> employeeArrayList = new ArrayList<>(employees);
        Collections.sort(employeeArrayList);
        System.out.println("Ascending order  : "+employeeArrayList);
        Collections.sort(employeeArrayList, new DescEmployee());
        System.out.println("Descending order : "+employeeArrayList);

    }
}
