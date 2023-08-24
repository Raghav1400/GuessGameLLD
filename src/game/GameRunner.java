package game;

public class GameRunner {
    Game game ;
    public GameRunner(Game game){
        this.game=game;
    }
    public void run(){
        game.start();
    }
}
