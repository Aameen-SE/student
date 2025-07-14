package objct;

import java.util.HashMap;
import java.util.Map;

class EmployeeMap{
    private int id;
    private String name;

    public EmployeeMap(int id , String name){
        this.id= id;
        this.name=name;
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
        return "Name : "+name+" Id : "+id;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj) return  true;
        if(obj==null) return false;
        if(this.getClass()!=obj.getClass()) return false;

        EmployeeMap other = (EmployeeMap) obj;

        return this.name.equals(other.name);
    }

    @Override
    public int hashCode() {

        //return id;
        return name.hashCode();
    }
}
public class EmployeeMapMain {

    public static void main(String[] args) {
        Map<EmployeeMap, String> employee = new HashMap<>();

        EmployeeMap emp1 = new EmployeeMap(145,"Ali");
        EmployeeMap emp2 = new EmployeeMap(125,"Arman");
        EmployeeMap emp3 = new EmployeeMap(145,"Rehan");

        employee.put(emp1,"HR");
        employee.put(emp2,"IT");
        employee.put(emp3,"Worker");
        for(Map.Entry<EmployeeMap,String> e : employee.entrySet()){
            System.out.println(e.getKey()+" = "+e.getValue());
        }

        // equal method
        System.out.println(emp1.equals(emp2));
        System.out.println(emp1.equals(emp3));

    }
}
