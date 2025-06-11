package jva.oop;

import java.util.ArrayList;
import java.util.Iterator;

//Patient class with: int patientId, String name, int age, String disease
class Patient{
    private int patientId;
    private String name;
    private int age;
    private String disease;

    public Patient(int patientId, String name, int age, String disease){
        this.patientId=patientId;
        this.name=name;
        this.age=age;
        this.disease=disease;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getDisease() {
        return disease;
    }

    public void display(){
        System.out.println("Patient Id : "+patientId);
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Disease : "+disease);
        System.out.println("==========================");
    }
}

class PatientService{

    private ArrayList<Patient> patient = new ArrayList<>();

    // Add patient
    public void addPatient (int patientId, String name, int age, String disease){

        patient.add(new Patient(patientId,name,age,disease));
        System.out.println("Patient Added succesfully \n-----------------------------\n");

    }


    //➤ View all patients

    public void viewAllPatient(){
        for(Patient p:patient){
            p.display();
        }
    }
    //➤ Update patient disease
    public void updateDisease(int id, String disease){
        boolean found = false;
        for(Patient p: patient){
            if(p.getPatientId()==id){
                p.setDisease(disease);
                found = true;
                System.out.println("Updated Successfully \n-----------------------------\n ");
                break;
            }
        }
        if(!found)
            System.out.println("No Such Patient data present with that id :"+id+"\n-----------------------------\n");

    }
// update patient age
    public void updateAge(int id, int age){
        boolean found = false;
        for(Patient p: patient){
            if(p.getPatientId()==id){
                p.setAge(age);
                found = true;
                System.out.println("Updated Successfully \n-----------------------------\n ");
                break;
            }
        }
        if(!found)
            System.out.println("No Such Patient data present with that id :"+id+"\n-----------------------------\n");

    }



    //➤ Delete patient by ID
    public void deletePatient(int id){
        boolean found = false;
        Iterator<Patient> iterator= patient.iterator();
        while(iterator.hasNext()){
            Patient p = iterator.next();
            if(p.getPatientId()==id){
                iterator.remove();
                found=true;
                System.out.println("Patient Data Deleted successfully \n-----------------------------\n");
                break;
            }
        }
        if(!found)
            System.out.println("No Such Patient data present with that id :"+id+"\n-----------------------------\n");
    }
}
public class HospitalManagement {
    public static void main(String[] args) {
        PatientService patientService=new PatientService();
        patientService.addPatient(141,"Arsalan ",25,"Eye Infection");
        patientService.addPatient(142,"Guddu ",32,"Shoulder Injury");
        patientService.addPatient(143,"Amin ",27,"No Girlfriend ");
        patientService.addPatient(144,"Ameen ",27,"Fracture ");
        patientService.viewAllPatient();

        System.out.println("\n==================================");
        patientService.deletePatient(144);

        patientService.updateDisease(141,"Lung Infection");
        patientService.updateAge(143,24);
        patientService.viewAllPatient();

    }
}
