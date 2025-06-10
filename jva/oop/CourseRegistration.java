package jva.oop;
// Course Registration
//Course: courseId, title, duration
//
//Operations: Add course, Delete course, Update duration, View list

import java.util.ArrayList;
import java.util.Iterator;

class Registration{
    private int courseId;
    private String title;
    private int duration;

    public Registration(int courseId, String title, int duration) {
        this.courseId = courseId;
        this.title = title;
        this.duration = duration;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void display(){
        System.out.println("CourseId : "+courseId);
        System.out.println("Title : "+title);
        System.out.println("Duration : "+duration+" week");
        System.out.println("-----------------");
    }
}

class RegistrationService{
    private ArrayList<Registration> registration = new ArrayList<>();

    //Add course
    public void addCourse(int courseId, String title, int duration){
        registration.add(new Registration(courseId,title,duration));
        System.out.println("Added successfully ");
    }

    // view all
    public void viewAll(){
        for(Registration r : registration){
            r.display();
        }
    }

    //Delete course
    public void deleteCourse(int id){
        boolean found=false;
        Iterator<Registration> regIterator = registration.iterator();
        while (regIterator.hasNext()){
            Registration re=regIterator.next();
            if(re.getCourseId()==id){
                regIterator.remove();
                found=true;
                System.out.println("Deleted Succesfully ");
                break;
            }
        }
        if(!found)
            System.out.println("No such course present with that id : "+id);

    }

    // update duration

    public void updateDuration(int id, int duration){
        boolean found = false;
        for(Registration r:registration){
            if(r.getCourseId()==id){
                r.setDuration(duration);
                found=true;
                System.out.println("Updated Sucessfully ");
                break;
            }
        }
        if (!found)
            System.out.println("No such course present with that id : "+id);
    }
}
public class CourseRegistration {
    public static void main(String[] args) {
        RegistrationService regService = new RegistrationService();
        regService.addCourse(145,"Learning Java",2);
        regService.addCourse(256,"Python for Beginner",3);
        regService.addCourse(478,"Javascript Learner",3);
        regService.viewAll();
        regService.updateDuration(256,5);
        regService.addCourse(742,"React Js",5);
        regService.deleteCourse(478);

        System.out.println("/n =======================");
        regService.viewAll();

    }
}
