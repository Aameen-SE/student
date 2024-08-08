package corejava.aug07;

public class Employee {
                        //Create a class Employee having member variables id, employeeName, employeeNum, dateHired, cityId. create getters and setters for all member
                        //		variables. Create object of Employee class in other class inside main method and set all member values and print all member values using
                        //		getters.
    private int id;
    private String employeeName;
    private String dateHired;
    private String cityId;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }

    public String getDateHired() {
        return dateHired;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityId() {
        return cityId;
    }
}
