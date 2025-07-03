package java8.functionalinterface;

import java.util.ArrayList;
import java.util.List;

// Create a Comparator using a lambda to sort a list of Employee objects by salary.
// (You can define an Employee class with fields: name, salary).
class Employee{
    private String name;
    private long salary;

    public Employee(String name, long salary){
        this.name=name;
        this.salary=salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public long getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Name : "+name+" Salary : "+salary;
    }
}
public class EmployeeMain {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Aameen",80000));
        employees.add(new Employee("Arsalan",650000));
        employees.add(new Employee("Khan",25000));

        employees.sort((e1,e2)->Double.compare(e1.getSalary(), e2.getSalary()));

        for (Employee e : employees){
            System.out.println(e);
        }
    }
}
