package javacore.clss;

public class SalariedEmployee {
    //Create a class SalariedEmployee having member variables id, annualSalary, employeeId. create getters and setters for all member variables.
    //		Create object of SalariedEmployee class in other class inside main method and set all member values and print all member values using
    //		getters.

   int id, annualSalary, employeeId;
   public void setId(int id){
       this.id=id;
    }
    public int getId(){
       return id;
    }

    public void setEmployeeId(int employeeId){
       this.employeeId=employeeId;
    }
    public int getEmployeeId(){
       return employeeId;
    }

    public void setAnnualSalary(int annualSalary){
       this.annualSalary=annualSalary;
    }
    public int getAnnualSalary(){
       return annualSalary;
    }
}
