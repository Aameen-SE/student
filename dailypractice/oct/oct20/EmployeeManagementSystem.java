package dailypractice.oct.oct20;

//Problem 1: Employee Management System
//You need to manage a list of employees. Each employee has:
//id (integer)
//name (String)
//salary (double)
//Requirements:
//Create a class Employee with proper constructors, getters, and toString() method.
//Store a list of employees using a Collection (your choice).
//Add at least 5 employees to your collection.
//Perform the following operations:
//Print all employees.
//Sort employees by salary in descending order and print.
//Remove employees whose salary is less than 50,000.
//Check if an employee with a specific id exists.
//Constraints:
//You must use Java Collection Framework classes (like ArrayList, HashSet, TreeSet, HashMap) for storage and operations.
//Use Comparator or Comparable for sorting.


import java.util.*;

class Employee{
 private long id;
 private String name;
 private double salary;

 public Employee(){}

 public Employee(long id , String name , double salary){
     this.id=id;
     this.name=name;
     this.salary=salary;
 }

 public void setId(long id){
     this.id=id;
 }

 public long getId(){
     return id;
 }

 public void setName(String name){
     this.name=name;
 }

 public String getName(){
     return name;
 }

 public void setSalary(double salary){
     this.salary=salary;
 }

 public double getSalary(){
     return salary;
 }

 public String toString(){
     return "Employee {"+" Id : "+id+" Name : "+name+" Salary : "+salary+"}\n";
 }

    @Override
    public boolean equals(Object obj) {
        if(this==obj) return  true;
        if(!(obj instanceof Employee)) return false;
        Employee e= (Employee) obj;
        return this.id==e.id;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(id);
    }
}
public class EmployeeManagementSystem {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(12,"Aameen Hussain",120000));
        employeeList.add(new Employee(121,"Adil Hussain",125000));
        employeeList.add(new Employee(122,"Zakir Hussain",12000));
        employeeList.add(new Employee(122,"Zakir Hussain",12000));

        // duplicates removed

        Set<Employee> employeeSet = new HashSet<>(employeeList);
        for(Employee e:employeeSet){
            System.out.println(e);
        }

        // print all employee

        for(Employee emp :employeeList){
           // System.out.println(emp);
        }

        // System.out.println(employeeList);

        // descending order according to salary


        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Double.compare(o2.getSalary(),o1.getSalary());
            }
        });

        //System.out.println("Descending order according to salary ");

       // for(Employee e: employeeList){
         //   System.out.println(e);
        //}
        employeeList.sort((a,b)->Double.compare(b.getSalary(),a.getSalary()));
        //System.out.println(employeeList);


        int searchId = 1221;

        boolean found = false;
        for(Employee empl : employeeList){
            if(empl.getId()==searchId){
                found =true;
            }
        }

//        if(found)
//            System.out.println("Exist ");
//        else
//            System.out.println("Does not exist ");
//
//        boolean exist = employeeList.stream().anyMatch(e -> e.getId()==searchId);
//        System.out.println(exist ?" Exist with id " : "Does not exist with id ");


    }

}
