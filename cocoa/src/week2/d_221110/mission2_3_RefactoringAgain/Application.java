package week2.d_221110.mission2_3_RefactoringAgain;

import week2.d_221110.mission2_3.Gamer;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Memento memento = new Memento();
        // Memento 객체 하나 생성
        originator.setMemento(memento);
        Random_Dice dice = new Random_Dice();

        for(int i =0; i<100; i++){
            dice.rollingDice(originator);
            if(originator.getMoney()<0){
                break;
            }
            if(originator.getMoney()> memento.getMoney()){
                originator.createMemento();
            }
            if(originator.getMoney()/2< memento.getMoney()){
                originator.restoreMemento();
            }

            System.out.println("Gamer의 돈: "+originator.getMoney());
            originator.getHaveFruits();
            System.out.println();
        }

    }
}
