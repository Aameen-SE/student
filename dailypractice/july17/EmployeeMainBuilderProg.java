package dailypractice.july17;
class Employee{
    private int empId;
    private String name;

    private Employee(Builder builder){
        this.name= builder.name;
        this.empId=builder.empId;
    }

    public static class Builder{
        private int empId;
        private String name;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEmpId(int empId) {
            this.empId = empId;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }
    }

    public void details(){
        System.out.println("Name : "+name+" EmpId : "+empId);
    }
}
public class EmployeeMainBuilderProg {

    public static void main(String[] args) {

        Employee employee = new Employee.Builder().setEmpId(142).setName("Aameen").build();
        employee.details();
    }
}
