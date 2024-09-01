package corejava.aug29;

public class CompanyMain {

    public static void main(String[] args) {
        //Create a class Company having member variables companyId, name, description.
        // create getters and setters for all member variables. Create
        //    		object of Company class in other class inside main method and set
        //    		all member values and print all member values using getters.


        Company company = new Company();
        company.setCompanyId(456);
        company.setName("Asif");
        company.setDescription("He is an Engineer here ");
        System.out.println("CompanyId : "+company.getCompanyId()+" ; Name : "+company.getName()+" ; " +
                "Description : "+company.getDescription());
    }

}
