package corejava.sep18;

public class CustomerMain {
    public static void main(String[] args) {

        Address homeAddress = new Address("Line 1","700024","Kolkata");

        Customer customer=new Customer("Aameen ", homeAddress);

        Address workAddress = new Address("Line 1 for work ","700018","Kolkata");

        customer.setWorkAddress(workAddress);
        System.out.println(customer);


    }
}
