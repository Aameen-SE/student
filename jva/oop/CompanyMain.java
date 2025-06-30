package jva.oop;

public class CompanyMain {
    public static void main(String[] args) {
        Company company = new Company();
        company.setCompanyId(123);
        company.setName("Aameen");
        company.setDescription("Java FullStack Developer ");

        System.out.println("Name : "+company.getName()+"\nCompany Id :" +
                " "+company.getCompanyId()+"\nDescription : "+company.getDescription());
    }
}
