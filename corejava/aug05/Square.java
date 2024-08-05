package corejava.aug05;

public class Square {
    private int side;

    Square(int side){
        this.side=side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public int calculateArea(){
        if(side<=0){
            return -1;
        }else {
            return side*side;
        }
    }

    public int calculatePerimeter(){
        if(side<=0)
        {
            return -1;
        }else
            return 4*side;
    }
}
