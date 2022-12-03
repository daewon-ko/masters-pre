package week2.d_221110.mission2_3_RefactoringAgain;

import java.util.Random;

public class Random_Dice {
    private Originator originator;
    private Memento memento;


    Random_Dice(){


    }

    public void rollingDice(Originator originator){
        Random random = new Random();
        int dice = random.nextInt(6)+1;
        if (dice ==1 || dice == 3){
            originator.addMoney();
        }
        if(dice == 2 || dice ==4 ){
            originator.halfMoney();
        }
        originator.takeFruit();
    }


}
