package jva.may27;

public class StudentMain {
    public static void main(String[] args) {

        Student st = new Student();
        st.setName("Aameen");
        st.setRollNo(456);

        Address ad = new Address();
        ad.setCity("Kolkata");
        ad.setHouseNo(456);
        ad.setPincode(700024);
        st.setAddress(ad);
        st.display();

    }
}
