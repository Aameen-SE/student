package objct.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Create a Person class with fields firstName and lastName. Write a comparator to sort by last name first, then by first name.
class Person{
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "First Name : "+firstName+" Last Name :  "+lastName;
    }
}

class NameComp implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        int lastName = o1.getLastName().compareTo(o2.getLastName());

        if(lastName==0){
            return o1.getFirstName().compareTo(o2.getFirstName());
        }
        return lastName;
    }
}
public class PersonMain {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Md","Hussain"));
        people.add(new Person("Aameen","Hussain"));
        people.add(new Person("Amin","Faraz"));
        people.add(new Person("Arsalan","Dawood"));
        people.add(new Person("Munna","Thakur"));
        people.add(new Person("Adil","Hussain"));

        Collections.sort(people,new NameComp());
        for (Person p : people){
            System.out.println(p);
        }
    }
}
