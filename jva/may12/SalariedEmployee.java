package jva.may12;

//Create a class SalariedEmployee having member variables id, annualSalary, employeeId.
// create getters and setters for all member variables.
//		Create object of SalariedEmployee class in other class inside main method
//		and set all member values and print all member values using
//		getters.
// encapsulation
public class SalariedEmployee {
  private int  id, annualSalary, employeeId;

  public void setId(int id){
      this.id=id;
  }
  public int getId(){
      return id;
  }

    public void setAnnualSalary(int annualSalary) {
        this.annualSalary = annualSalary;
    }

    public int getAnnualSalary() {
        return annualSalary;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void display(){
        System.out.println("Id : "+getId()+" ; Annual Salary : "+getAnnualSalary()+" ; Employee Id :"+getEmployeeId());
    }
}
