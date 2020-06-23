package uni;

import java.util.Random;

public class Dice {

    public static int RollDice(int a){

        Random rand = new Random();
        int dice = rand.nextInt(a) + 1;

        System.out.println("You rolled " + dice);
        return dice;
    }


}
