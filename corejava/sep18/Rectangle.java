package corejava.sep18;

public class Rectangle {
    private float length;
    private float width;

    public Rectangle(float length , float width ){
        this.length=length;
        this.width=width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float areaOfRectangle(){
       return length*width;

        }

        public float peri(){
        return 2*(length+width);

        }
    public String toString(){
        return String.format("length - %f , width - %f , area - %f ,perimeter - %f",length , width, areaOfRectangle(),  peri()  );
    }
}
