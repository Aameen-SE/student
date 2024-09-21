package corejava.sep21;

public abstract class AbstRecipe {
    public void execute(){
        getReady();
        doTheDish();
        cleanUp();
    }
    abstract void getReady();
    abstract void doTheDish();
    abstract void cleanUp();
}
