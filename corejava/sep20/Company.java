
//Create a class Company having member variables companyId,
// name, description. create getters and setters for all
// member variables. Create
//		object of Company class in other
//		class inside main method and set all member values and print all member values using getters.
//

package corejava.sep20;

public class Company {

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

    public String toString(){
        return String.format("name- %s, companyId- %d, description - %s",name ,companyId, description);
    }
}
