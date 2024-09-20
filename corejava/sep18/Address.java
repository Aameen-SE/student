package corejava.sep18;

public class Address {
    private String Line1;
    private String zip;
    private String city;

    public Address(String Line1 , String zip, String city){
       super();
        this.city=city;
        this.Line1=Line1;
        this.zip=zip;
    }

    @Override
    public String toString() {
        return "Address{" +
                "Line1='" + Line1 + '\'' +
                ", zip='" + zip + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
