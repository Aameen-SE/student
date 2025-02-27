package clsss;

public class CompanyMain {
    public static void main(String[] args) {
        //1.	Create a class Company having member variables companyId, name, description. create getters and setters for all member variables. Create
        //		object of Company class in other class inside main method and set all member values and print all member values using getters.
        //

        Company company = new Company(123,"Aameen","A Designer");
        System.out.println(company.toString());
        System.out.println(company.getCompanyId()+" "+company.getDescription()+" "+company.getName());

    }
}
