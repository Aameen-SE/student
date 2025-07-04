package java8.methodreference;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Create a class Person with a getName() method.
// Create a list of Person objects and use a method reference to extract all names into a new list.
class Person{

    private int age;
    private String name;

    public Person(String name, int age){
        this.age=age;
        this.name=name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

}
public class People {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Aameen",24));
        people.add(new Person("Adil",18));
        people.add(new Person("Arsalan",23));

        List<String> nameList = people.stream().map(Person::getName).collect(Collectors.toList());
        System.out.println("Name List : "+nameList);

        List<Integer> ageList = people.stream().map(Person::getAge).collect(Collectors.toList());

    }
}
