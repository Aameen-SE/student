package objct.comparator;
//Create a Project class with fields name and deadline (as LocalDate).
// Write a comparator to sort projects by deadline date ascending.

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Project {
    private String name;
    private LocalDate deadline;

    public Project(String name, LocalDate deadline) {
        this.name = name;
        this.deadline = deadline;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "Name : "+name+" Deadline : "+deadline;
    }
}

class DeadlineComp implements Comparator<Project>{
    @Override
    public int compare(Project o1, Project o2) {
        return o1.getDeadline().compareTo(o2.getDeadline());
    }
}

public class ProjectMain {

    public static void main(String[] args) {

        List<Project> projects = new ArrayList<>();
        projects.add(new Project("Java Project ",LocalDate.of(2025,07,8)));
        projects.add(new Project("Python Project ",LocalDate.of(2025,07,4)));
        projects.add(new Project("Javascript Project ",LocalDate.of(2025,07,3)));
        projects.add(new Project("React Project ",LocalDate.of(2025,07,11)));

        Collections.sort(projects,new DeadlineComp());

        for(Project p :projects){
            System.out.println(p);
        }

    }
}
