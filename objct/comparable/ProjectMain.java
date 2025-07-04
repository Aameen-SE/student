package objct.comparable;
//Create a Project class with fields projectName and deadline (as LocalDate). Sort projects by deadline date in ascending order

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Project implements Comparable<Project>{
    private String projectName;
    private LocalDate deadline;

    public Project(String projectName, LocalDate deadline) {
        this.projectName = projectName;
        this.deadline = deadline;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "projectName='" + projectName +", deadline=" + deadline ;
    }

    @Override
    public int compareTo(Project o) {
        return this.deadline.compareTo(o.deadline);
    }
}
public class ProjectMain {

    public static void main(String[] args) {
        List<Project> projects = new ArrayList<>();
        projects.add(new Project("Java Project",LocalDate.of(2025,06,07)));
        projects.add(new Project("Python Project",LocalDate.of(2025,06,02)));
        projects.add(new Project("Javascript Project",LocalDate.of(2025,06,05)));

        Collections.sort(projects);

        for (Project p: projects){
            System.out.println(p);
        }
    }
}
