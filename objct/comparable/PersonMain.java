package objct.comparable;

//Create a Person class with fields firstName, lastName, and age. Sort persons first by last name, then by first name.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person implements  Comparable<Person>{

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return  "firstName='" + firstName +", lastName='" + lastName + ", age=" + age ;
            }

    @Override
    public int compareTo(Person o) {
        int lastSort = this.lastName.compareTo(o.lastName);
        if(lastSort==0){
            return this.firstName.compareTo(o.firstName);
        }
        return lastSort;
    }
}
public class PersonMain {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        people.add(new Person("Aameen","Hussain",25));
        people.add(new Person("Md","Hussain",14));
        people.add(new Person("Amin","Faraz",24));
        people.add(new Person("Arslan","Taj",25));

        Collections.sort(people);

        for (Person p: people){
            System.out.println(p);
        }
    }
}
