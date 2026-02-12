package practice2026.oop.abstractn;

public class Employee extends Person {

    public Employee(String name) {
        super(name);
    }

    @Override
    void getRole() {
        System.out.println("Software Engineering");
    }

    public static void main(String[] args) {
        Person employee = new Employee("Aameen");
        System.out.println(employee.name);
        employee.getRole();

    }
}
