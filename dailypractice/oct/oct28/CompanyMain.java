package dailypractice.oct.oct28;
//Create a class Company having member variables companyId, name, description.
// create getters and setters for all member variables. Create
//		object of Company class in other class inside main method and
//		set all member values and print all member values using getters.
class Company{

    private Long companyId;

    private String name;

    private String description;


    public Company(){}

    public Company(Long companyId,String name, String description){
        this.companyId=companyId;
        this.name=name;
        this.description=description;
    }


    public void setCompanyId(Long companyId){
        this.companyId=companyId;
    }

    public Long getCompanyId(){
        return companyId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Id : "+companyId+" Name : "+name+" Description :"+description;
    }

}
public class CompanyMain {

    public static void main(String[] args) {
        Company company= new Company();
        company.setCompanyId(125l);
        company.setName("Aameen Hussain");
        company.setDescription("He is a backend Engineer");

        System.out.println(company);
    }

}
