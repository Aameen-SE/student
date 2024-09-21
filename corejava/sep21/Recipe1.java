package corejava.sep21;

public class Recipe1 extends  AbstRecipe{

    public void getReady(){
        System.out.println("GetReady ");
    }

    public void doTheDish(){
        System.out.println("Do the Dish ");
    }
    public void cleanUp(){
        System.out.println("CleanUp ");
    }

    public static void main(String[] args) {
        Recipe1 rec = new Recipe1();
        rec.doTheDish();
        rec.getReady();
        rec.cleanUp();
    }

}
