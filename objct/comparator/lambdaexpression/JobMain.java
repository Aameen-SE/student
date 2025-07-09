package objct.comparator.lambdaexpression;

//Create a Job class with fields title, companyName, and salary.
//👉 Sort jobs first by company name alphabetically, and if company names are equal, by salary descending.

import java.util.ArrayList;
import java.util.List;

class Job{
    private String title;
    private String companyName;
    private double salary;

    public Job(String title, String companyName, double salary) {
        this.title = title;
        this.companyName = companyName;
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Title : "+title+" Company Name : "+companyName+" Salary :"+salary;
    }
}
public class JobMain {

    public static void main(String[] args) {

        List<Job> jobs = new ArrayList<>();
        jobs.add(new Job("Software Engineer","CISCO",80000));
        jobs.add(new Job("SQL Developer ","AMAZON",65000));
        jobs.add(new Job("Backend Engineer","WIPRO",90000));
        jobs.add(new Job("FrontEnd Engineer","AMAZON",70000));

        jobs.sort((e1,e2)->
        {
            if(e1.getCompanyName().compareTo(e2.getCompanyName())!=0){
                return e1.getCompanyName().compareTo(e2.getCompanyName());
            }
            else
                return Double.compare(e2.getSalary(), e1.getSalary());
        });

        for (Job j:jobs){
            System.out.println(j);
        }
    }
}
