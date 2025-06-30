package jva.oop.june30;
//Student and Address classes
//
//Student class with name, roll number, and an Address object.
//
//Address class with city, state, and pincode.
//
//Override toString() to print student's full info including address.
class Student{
    private String name;
    private int rollNumber;
    private Address address;

    public Student(String name , int rollNumber, Address address){
        this.address=address;
        this.name=name;
        this.rollNumber=rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String toString(){
        return "\nRollNumber : "+rollNumber+"\nName : "+name+" \n Address : "+address;
    }
}

class Address {
    private String city ;
    private String state ;
    private int pincode;



    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return " : "+city+" "+pincode+" "+state;
    }
}
public class StudentMain {
    public static void main(String[] args) {
        Address address = new Address();
        address.setCity("Kolkata");
        address.setState("WestBengal");
        address.setPincode(700024);

        Student student= new Student("Aameen",14,address);
        System.out.println(student.toString());
    }
}
