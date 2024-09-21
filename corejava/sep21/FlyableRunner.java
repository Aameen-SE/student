package corejava.sep21;
interface flyable{
    void fly();
}
class Birds implements flyable{
    public void fly(){
        System.out.println("with wings ");
    }
}

class Aeroplane implements flyable{
    @Override
    public void fly() {
        System.out.println("with fuel ");
    }
}
public class FlyableRunner {

    public static void main(String[] args) {
        flyable[] fly ={new Birds(), new Aeroplane()};
        for(flyable obj : fly){
            obj.fly();
        }
    }
}
