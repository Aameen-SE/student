package corejava.aug05;

public class Dimension {
    private int feets;
    private int inches;



    public Dimension(int inches) {
        if(inches<0)
        {
            this.inches=-1;
            this.feets=-1;
        }else {
            this.feets=inches/12;
            this.inches=inches%12;
        }
    }

    public void setFeets(int feets) {
        this.feets = feets;
    }
    int getFeeds(){
        return this.feets;
    }

    void setInches(int inches){
        this.inches=inches;
    }

    int getInches(){
        return this.inches;
    }
}
