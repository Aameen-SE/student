package jva.may22;
//Create a system to manage different types of employees in a company.
//
//✅ Requirements:
//Create an abstract class Employee with:
//
//id (int)
//
//name (String)
//
//salary (double)
//
//Abstract method: calculateSalary()
//
//Create two subclasses:
//
//FullTimeEmployee
//
//Fixed monthly salary
//
//PartTimeEmployee
//
//hoursWorked (int)
//
//hourlyRate (double)
//
//Main Program:
//
//Store both full-time and part-time employees in a List<Employee>
//
//Display the name, type, and calculated salary for each employee using polymorphism

abstract class Employee{
    private int id ;
    private String name;


    public Employee(int id, String name){
        this.id=id;
        this.name=name;

    }

    abstract void calculateSalary();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

class  FullTimeEmployee extends Employee{

        private double monthlySalary;
    public FullTimeEmployee(int id, String name, double monthlysalary) {
        super(id, name);
        this.monthlySalary=monthlysalary;
    }

    @Override
    void calculateSalary() {
        System.out.println("Full Time Employee  : Name  : "+getName()+"---> Monthly Salary : "+monthlySalary);
    }
}

class PartTimeEmployee extends Employee{
    int hoursWorked;
    double hourlyRate;

    public PartTimeEmployee(int id, String name, int hoursWorked, double hourlyRate) {
        super(id, name);
        this.hourlyRate=hourlyRate;
        this.hoursWorked=hoursWorked;

    }

    @Override
    void calculateSalary() {
        int calSal = (int) (hoursWorked * hourlyRate);
        System.out.println("PartTime Employee : Name  : "+getName()+"--->  Salary : "+calSal);
    }
}




public class EmployeeMain {
    public static void main(String[] args) {
        FullTimeEmployee fEmployee = new FullTimeEmployee(124,"Aameen",80000);
        fEmployee.calculateSalary();

        PartTimeEmployee pEmployee = new PartTimeEmployee(245,"Arsalan",10,100);
        pEmployee.calculateSalary();
    }

}
