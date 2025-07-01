package clsss.july01;
//Create a class Company having member variables companyId, name, description. create getters and setters
// for all member variables. Create
//		object of Company class in other class inside main method and set all member values and
//		print all member values using getters.
class Company{
    private int companyId;
    private String name;
    private String description;

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
public class CompanyMain {
    public static void main(String[] args) {
        Company company= new Company();
        company.setCompanyId(145);
        company.setName("Aameen");
        company.setDescription("Java FullStack Developer");

        System.out.println("ID : "+company.getCompanyId()+"\nName : "+company.getName()+"\nDescription : "+company.getDescription());
    }
}
