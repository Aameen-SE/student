package dailypractice.july18;
//Create a class Company having member variables companyId, name, description. create getters and setters for all member variables. Create
//		object of Company class in other class inside main method and set all member values and print all member values using getters.
class Company{
    private int companyId;
    private String name;
    private String description;

    private Company(Builder builder){
        this.companyId=builder.companyId;
        this.name=builder.name;
        this.description=builder.description;
    }

    public static class Builder{
        private int companyId;
        private String name;
        private String description;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setCompanyId(int companyId) {
            this.companyId = companyId;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Company build(){
            return new Company(this);
        }
    }

    public  void display(){
        System.out.println("CompanyId : "+companyId+ "\nName : "+name+"\nDescription : "+description);
    }
}
public class CompanyBuilder {

    public static void main(String[] args) {

        Company company = new Company.Builder().setCompanyId(1456).setName("Microsft")
                .setDescription("A Windows OS company").build();
        company.display();
    }
}
