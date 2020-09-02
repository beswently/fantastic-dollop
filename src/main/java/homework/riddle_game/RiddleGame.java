package homework.riddle_game;

import design_patterns.template_method.Game;
import java.util.Scanner;
import javax.swing.*;

/**
 * @author Evgeny Borisov
 */
public class RiddleGame implements Game {

    //todo

    private final int maxLimit;
    public RiddleGame(int max) {
        this.maxLimit = max;
    }

    public static void main(String[] args) {

        int maxLimit = Integer.parseInt(JOptionPane.showInputDialog("input maximum number"));
        System.out.println(maxLimit);
        RiddleGame game = new RiddleGame(maxLimit);
        game.play();


    }
    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    @Override
    public void play() {
        int s = Integer.parseInt(JOptionPane.showInputDialog("input your number"));
        int suggestNumber = getRandomNumber(0, maxLimit);
        System.out.println(suggestNumber);
        while(true){
            if (s < suggestNumber){
                System.out.format("The suggestion number is more than %d \n",  s);
            }
            if (s > suggestNumber){
                System.out.format("The suggestion number is less than %d \n",  s);
            }
            if (s == suggestNumber){
                System.out.format("You win!!! \n");
                System.out.format("Suggested number is %d \n", s);
                break;
            }
            s = Integer.parseInt(JOptionPane.showInputDialog("input your number"));

        }

    }
}
