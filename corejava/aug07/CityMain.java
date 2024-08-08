package corejava.aug07;

public class CityMain {
    public static void main(String[] args) {
        City city = new City();
        city.setCity("Kolkata");
        city.setId(148);

        System.out.println("Id :"+city.getId()+" ; City :"+city.getCity());
    }
}
