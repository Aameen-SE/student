package objct.comparable;
// Create a Job class with fields jobTitle and salary.
// Sort jobs by salary descending, and if same, sort by job title alphabetically.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Job implements Comparable<Job>{
    private String jobTitle;
    private double salary;

    public Job(String jobTitle, double salary) {
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Title : "+jobTitle+" Salary : "+salary;
    }

    @Override
    public int compareTo(Job o) {
        double sortSalary = Double.compare(this.salary,o.salary);
        if(sortSalary==0){
            return this.jobTitle.compareTo(o.jobTitle);
        }
        return (int) sortSalary;
    }
}
public class JobMain {

    public static void main(String[] args) {

        List<Job> jobs = new ArrayList<>();
        jobs.add(new Job("Software Developer",80000.0));
        jobs.add(new Job("Backend Developer",90000.0));
        jobs.add(new Job("Frontend Developer",65000.0));
        jobs.add(new Job("Android Developer",80000.0));

        Collections.sort(jobs);
        for (Job j:jobs){
            System.out.println(j);
        }
    }
}
