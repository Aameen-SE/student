package corejava.sep20;

public class CompanyRunner {
    public static void main(String[] args) {
        Company company = new Company();
        company.setCompanyId(123);
        company.setName("Aameen");
        company.setDescription("Im Aameen Hussain ");
        System.out.println("Name :"+company.getName()+" , CompanyId : "+company.getCompanyId()+" Description : "+company.getDescription());
        System.out.println(company);
    }
}
