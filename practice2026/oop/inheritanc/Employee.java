package practice2026.oop.inheritanc;

public class Employee extends Person{
    int salary ;

    public Employee(String name,int salary) {
        super(name);
        this.salary=salary;
    }

    @Override
    public void display() {
        System.out.println("name : "+name+" Salary : "+salary);
    }
}
