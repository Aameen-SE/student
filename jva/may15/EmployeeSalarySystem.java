package jva.may15;
//Design a system to calculate the salaries of different types of employees in a company using abstraction.
// The company has three types of employees:
//FullTimeEmployee
//PartTimeEmployee
//Freelancer

//Each employee has a name and an ID. The salary is calculated differently for each:

//FullTimeEmployee: Has a fixed monthly salary.
//PartTimeEmployee: Paid hourly; salary = hourlyRate * hoursWorked
//Freelancer: Paid per project; salary = projectRate * numberOfProjects

abstract class Employee{
    private int id;
    private String name;

    Employee(int id , String name){
        this.id=id;
        this.name=name;
    }

    abstract double calculateSalary();

    public void display(){
        System.out.println("Name : "+name+"  \nId : "+id+" \nSalaray : "+calculateSalary()+"\n--------------");
    }
}

class FullTimeEmployee extends Employee{
        private double monthlySalary;

   public FullTimeEmployee(int id, String name ,double monthlySalary){
       super(id,name);
       this.monthlySalary= monthlySalary;

   }
    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee{
private double hourlyRate ;
private double hoursWorked;
    PartTimeEmployee(int id,String name, double hourlyRate , double hoursWorked ){
        super(id,name);
        this.hoursWorked=hoursWorked;
        this.hourlyRate=hourlyRate;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

class Freelancer extends Employee{

  private double  projectRate ;
  private double numberOfProjects;

    Freelancer(int id, String name, double projectRate, double numberOfProjects ){
        super(id,name);
        this.projectRate=projectRate;
        this.numberOfProjects=numberOfProjects;
    }

    @Override
    double calculateSalary() {
        return projectRate * numberOfProjects;
    }
}


public class EmployeeSalarySystem {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee =new FullTimeEmployee(123,"Aameen",30000);
        fullTimeEmployee.display();

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(345,"Khan",500,7);
        partTimeEmployee.display();

        Freelancer freelancer =new Freelancer(456,"Amin",100,15);
        freelancer.display();

    }
}
