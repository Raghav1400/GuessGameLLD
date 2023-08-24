package player;

public class Player {
    private int guessNumber;
    private String name;

    public Player(String name){
        this.name=name;
    }

    public void setGuessNumber(int guessNumber) {
        this.guessNumber = guessNumber;
    }

    public int getGuessNumber() {
        return guessNumber;
    }
}
