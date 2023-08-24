package game;

import player.Player;

import java.util.Random;
import java.util.Scanner;

public class GuessGame implements Game{
    private Player p1=new Player("ram");
    private Player p2=new Player("harsh");
    private Player p3=new Player("rohit");
    public void start(){
        System.out.println("Enter target: ");
        int target = new Scanner(System.in).nextInt();

        Random rand = new Random();
        boolean flag=true;
        while(flag){
            p1.setGuessNumber(rand.nextInt(target) + 1);
            p2.setGuessNumber(rand.nextInt(target) + 1);
            p3.setGuessNumber(rand.nextInt(target) + 1);

            System.out.printf("p1 guess is: %d ",p1.getGuessNumber());
            System.out.printf("p2 guess is: %d ",p2.getGuessNumber());
            System.out.printf("p3 guess is: %d \n",p3.getGuessNumber());

            if(target== p1.getGuessNumber()) {
                System.out.println("p1 wins...");
                flag=false;
            }
            else if (target==p2.getGuessNumber()) {
                System.out.println("p2 wins...");
                flag=false;
            } else if (target==p3.getGuessNumber()) {
                System.out.println("p3 wins...");
                flag=false;
            }
            else System.out.println("trying again...");

        }
        System.out.println("Game Over .....");
    }
}
