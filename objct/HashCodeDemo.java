package objct;
class Employee{
    private String name;
    private int id;

    public Employee(String name , int id){
        this.name=name;
        this.id=id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;

    }

    @Override
    public String toString() {
        return "Name : "+name +" Id :"+id;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj){ return true;}

        if(obj==null){ return false;}

        if(this.getClass()!=obj.getClass()){
        return false ;
        }

        Employee emp = (Employee) obj;
         return this.id== emp.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
public class HashCodeDemo {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Aameen",123);
        Employee emp2 = new Employee("Arsalan",123);

        System.out.println(emp1.equals(emp2));
    }
}
