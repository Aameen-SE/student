package jva.may12;

// Create a class City having member variables id, city.
// create getters and setters for all member variables. Create object of City class in
//		other class inside main method and set all member values and print all member values using getters.
//
public class City {
    private int id ;
    private String city ;

    // creating parametrized constructor
    public City(int id , String city){
        this.id=id;
        this.city=city;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }
}
