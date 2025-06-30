package jva.oop.june30;
// Employee and Department classes
//
//Employee class with id, name, and Department object.
//
//Department class with deptName and location.
//
//Override toString() in both to show all info.
class Employee{
    private int id;
    private String name;
    private Department department;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String toString(){
        return "Id: "+id+"\nName : "+name+"\nDepartment : "+department;
    }
}
class Department{
    private String deptName;
    private String location;

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return ""+deptName+"\nLocation : "+location;
    }
}
public class EmployeeMain {
    public static void main(String[] args) {
        Department department= new Department();
        department.setDeptName("Engineer");
        department.setLocation("Kolkata");

        Employee employee = new Employee();
        employee.setId(124);
        employee.setName("Aameen");
        employee.setDepartment(department);

        System.out.println(employee.toString());

    }
}
