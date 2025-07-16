package dailypractice.july16;
//Create a House class using Builder Pattern (fluent style).
//
//Requirements
//Fields: windows, doors, roofType.
//
//Methods in Builder should return this to allow chaining:

class House {
    private int windows;
    private int doors;
    private String roofType;

    private House(Builder builder){
        this.doors=builder.doors;
        this.windows=builder.windows;
        this.roofType=builder.roofType;

    }

    public static class Builder{
        private int windows;
        private int doors;
        private String roofType;

        public Builder setWindows(int windows) {
            this.windows = windows;
            return this;
        }

        public Builder setDoors(int doors) {
            this.doors = doors;
            return this;
        }

        public Builder setRoofType(String roofType) {
            this.roofType = roofType;
            return this;
        }

        public House build(){
            return new House(this);
        }
    }

    public void printDetails(){
        System.out.println("Windows : "+windows+" RoofType :"+roofType+" Doors : "+doors);
    }
}
public class HouseBuilder {

    public static void main(String[] args) {

        House house1 = new House.Builder().setDoors(24).setRoofType("Gable").setWindows(12).build();
        house1.printDetails();

    }
}
