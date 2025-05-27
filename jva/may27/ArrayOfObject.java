package jva.may27;

//Create an array of 3 Student objects, each having different Address values.
// Write a loop to display the details of all students

class NewStudent {
    private int rollNo;
    private String name;
    private Addrss address;

    public NewStudent(int rollNo, String name, Addrss address){
        this.name=name;
        this.rollNo=rollNo;
        this.address=address;
    }

    public void display(){
        System.out.println("RollNo : "+rollNo);
        System.out.println("Name : "+name);
        System.out.println("Address "+address.toString());
        System.out.println("-----------------------------");
    }

}

class Addrss{
    private int pincode;
    private int houseNo;
    private String city ;

    public Addrss(int pincode, int houseNo, String city)
    {
        this.city=city;
        this.houseNo=houseNo;
        this.pincode=pincode;
    }

    public String toString(){
        return "Pincode : "+pincode+" HouseNo : "+houseNo+" City : "+city;
    }
}

public class ArrayOfObject {
    public static void main(String[] args) {

        NewStudent [] newStudents= new NewStudent[3];

        Addrss ad1 = new Addrss(70000,456,"Kolkata");
        Addrss ad2 = new Addrss(70034,458,"Pune");
        Addrss ad3 = new Addrss(70056,46,"Haryan");

        newStudents[0]=new NewStudent(4523,"Aameen",ad1);
        newStudents[1]=new NewStudent(4553,"Arsalan",ad2);
        newStudents[2]=new NewStudent(4583,"Amin",ad3);

        for(NewStudent st : newStudents){
            st.display();
        }
    }
}
