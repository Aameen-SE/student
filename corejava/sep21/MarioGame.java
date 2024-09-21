package corejava.sep21;

public class MarioGame implements GamingConsole{
    @Override
    public void up() {
        System.out.println("Jump");
    }

    @Override
    public void down() {
        System.out.println();
    }

    @Override
    public void right() {
        System.out.println("Forward");
    }

    @Override
    public void left() {
        System.out.println("Backward");
    }
}