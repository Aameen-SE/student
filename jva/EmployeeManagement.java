package jva;
//3. Employee Management
//Employee: id, name, salary
//
//Operations: Add employee, Delete by id, Update salary, View all

import java.util.ArrayList;
import java.util.Iterator;

class Employee{
    private int id;
    private  String name;
    private Long salary;

    public Employee(int id , String name, Long salary){
        this.salary=salary;
        this.id=id;
        this.name=name;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public Long getSalary() {
        return salary;
    }

    public void display(){
        System.out.println("Name : "+name);
        System.out.println("Id : "+id);
        System.out.println("Salary : "+salary);
        System.out.println("-------------------------");
    }
}

class EmployeeService{
    private ArrayList<Employee> employees= new ArrayList<>();

    //Add employee
    public void addEmployee(int id, String name, Long salary){
        employees.add(new Employee(id,name,salary));
        System.out.println("Added successfuly \n");
    }

    //Delete by id
    public void deleteById(int id){
        boolean found = false;
        Iterator<Employee> employeeIterator= employees.iterator();

        while(employeeIterator.hasNext()){
            Employee e= employeeIterator.next();
            if(e.getId()==id){
                employeeIterator.remove();
                found=true;
                System.out.println("Deleted sucessfully \n");
                break;
            }
        }

        if(!found)
            System.out.println("No Such employee exist with that id : "+id);
    }


    // view all list
    public void viewAllList(){
        for(Employee e: employees){
            e.display();
        }
    }

    //Update salary

    public void updateSalary(int id, Long salary){
        boolean found = false;
        for(Employee e: employees){
            if(e.getId()==id){
                e.setSalary(salary);
                found=true;
                System.out.println("Updated Sucesfully\n");
                break;
            }
        }
        if (!found)
            System.out.println("No such employee with that id : "+id);
    }
}
public class EmployeeManagement {
    public static void main(String[] args) {

        EmployeeService employeeService= new EmployeeService();
        employeeService.addEmployee(12,"Aameen",34000l);
        employeeService.addEmployee(13,"Rahul",44000l);
        employeeService.addEmployee(14,"Ashraf",54000l);
        employeeService.addEmployee(15,"Akhtar",64000l);
        employeeService.viewAllList();
        employeeService.deleteById(12);
        employeeService.viewAllList();
        employeeService.updateSalary(14,98000l);
        employeeService.viewAllList();
    }
}
