package corejava.sep03;

public class KidsMain {
    public static void main(String[] args) {
        Kids kids = new Kids(123,"Aameen",70,23,"Medium");

        System.out.println("Id : "+kids.getId()+" ; Name : "+kids.getName()+" ; " +
                "LevelofEnergy : "+kids.getLevelOfEnergy()+" ; Age : "+kids.getAge()+
                " ; LevelofCuriosity : "+kids.getLevelOfCuriosity());
    }
}
