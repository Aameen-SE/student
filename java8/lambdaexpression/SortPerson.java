package java8.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Sort a list of custom objects using a lambda
class Person{
    private String name ;
    private int age;
   public Person(String name, int age ){
        this.name=name;
        this.age=age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name : "+name +" Age : "+age;
    }
}
public class SortPerson {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Aameen",25));
        people.add(new Person("Arsalan",21));
        people.add(new Person("Amin",28));

        people.sort((p1,p2)->p1.getAge() - p2.getAge());
        System.out.println(people);


    }
}
