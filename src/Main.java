import game.Game;
import game.GameRunner;
import game.GuessGame;

public class Main {
    public static void main(String[] args) {
        Game game =new GuessGame();
        GameRunner runner =new GameRunner(game);
        runner.run();
    }
}