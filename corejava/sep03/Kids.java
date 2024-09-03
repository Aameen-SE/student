package corejava.sep03;

public class Kids {
                        //Create a class kids with member variables id, name, levelOfEnergy, age,
                        // levelOfCuriosity and member methods are getters,  and setters,


    private int id ;
    private String name;
    private int levelOfEnergy;
    private int age;
    private String levelOfCuriosity;

    Kids(int id,String name, int levelOfEnergy , int age , String levelOfCuriosity){
        this.id=id;
        this.name=name;
        this.levelOfEnergy=levelOfEnergy;
        this.age=age;
        this.levelOfCuriosity=levelOfCuriosity;
    }

    public String getLevelOfCuriosity() {
        return levelOfCuriosity;
    }

    public void setLevelOfCuriosity(String levelOfCuriosity) {
        this.levelOfCuriosity = levelOfCuriosity;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLevelOfEnergy() {
        return levelOfEnergy;
    }

    public void setLevelOfEnergy(int levelOfEnergy) {
        this.levelOfEnergy = levelOfEnergy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
