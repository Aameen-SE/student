package objct.comparator;
//Create an Employee class with fields name and salary. Write a comparator to sort employees by name alphabetically.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee{
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Name : "+name+" Salary : "+salary;
    }
}

class NameCompare implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}


public class EmployeeMain {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Rehan",75000));
        employees.add(new Employee("Aameen",75000));
        employees.add(new Employee("Kaif",75000));

        Collections.sort(employees,new NameCompare());

        for (Employee e :employees){
            System.out.println(e);
        }
    }
}
