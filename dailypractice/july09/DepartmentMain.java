package dailypractice.july09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

class Department{
    private int deptId;
    private String deptName;

    public Department(int deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "DeptId  : "+deptId+" DeptName : "+deptName;
    }
}

class Employee{
    private int empId;
    private String name;
    private Department department;
    private List<String> skills;

    public Employee(int empId, String name, Department department, List<String> skills) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.skills = skills;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
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

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "EmpId : "+empId+"\nName : "+name+"\nDepartment : "+department+"\nSkills : "+skills+"\n============";
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj)return true;

        if(obj==null)return false;

        if(this.getClass()!=obj.getClass()) return false;

        Employee other= (Employee) obj;

        return this.empId==other.getEmpId()&& this.name==other.getName()&&
                this.skills==other.getSkills()&&this.department==other.getDepartment();
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, name, department, skills);
    }

}
public class DepartmentMain {

    public static void main(String[] args) {

        Department dept1 = new Department(124,"IT");
        List<String> skill1 = new ArrayList<>(Arrays.asList("Java","SQL"));
        Employee emp1 = new Employee(124,"Aameen Hussain",dept1,skill1);
        System.out.println(emp1.toString());

        Department dept2 = new Department(122,"CSE");
        List<String> skill2 = new ArrayList<>(Arrays.asList("Java","SpringBoot"));
        Employee emp2 = new Employee(122,"Amin Faraz",dept2,skill2);
        System.out.println(emp2.toString());

        Department dept3= new Department(124,"IT");
        List<String> skill3 = new ArrayList<>(Arrays.asList("Java","SQL"));
        Employee emp3 = new Employee(124,"Aameen Hussain",dept3,skill3);
        System.out.println(emp3.toString());

        //toequalMethod
        System.out.println("Employee1 is equal to employee2 : "+emp1.equals(emp2));


        //tohashcode Method

        System.out.println("Emp1 hashcode : "+emp1.hashCode());
        System.out.println("Emp2 hashcode : "+emp2.hashCode());
        System.out.println("Emp3 hashcode : "+emp3.hashCode());


    }
}
