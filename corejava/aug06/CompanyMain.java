package corejava.aug06;

public class CompanyMain {
    public static void main(String[] args) {

        Company company=new Company();
        company.setCompanyId(1234);
        company.setDescription("Software Engineer");
        company.setName("Asif Aftab");

        System.out.println("Company id : "+company.getCompanyId()+" ; Name :"+ company.getName()+" ; Description : "+ company.getDescription());
    }
}
