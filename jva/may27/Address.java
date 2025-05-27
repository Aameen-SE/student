package jva.may27;

public class Address {
    private int pincode;
    private int houseNo;
    private String city;

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return
                "pincode=" + pincode +
                ", houseNo=" + houseNo +
                ", city=" + city  ;
    }
}
