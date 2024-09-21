package corejava.sep21;

public class GameRunner {
    public static void main(String[] args) {
       // MarioGame game = new MarioGame();
        //ChessGame game= new ChessGame();
       // GamingConsole game = new MarioGame();
        GamingConsole game = new ChessGame();
        game.up();
        game.down();
        game.right();
        game.left();
    }
}
