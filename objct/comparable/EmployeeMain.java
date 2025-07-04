package objct.comparable;

//Create an Employee class with fields name and salary. Sort employees by salary in descending order using Comparable.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>{
    private String name;
    private  Long salary;

    public Employee(String name, Long salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Name : "+name+"\nSalary : "+salary;
    }


    @Override
    public int compareTo(Employee employee) {
        return Long.compare(employee.salary,this.salary);
    }
}

public class EmployeeMain {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Aameen",850000l));
        employees.add(new Employee("Amin",950000l));
        employees.add(new Employee("Arsalan",1050000l));

        Collections.sort(employees);
        for(Employee e: employees){
            System.out.println(e);
        }
    }
}
