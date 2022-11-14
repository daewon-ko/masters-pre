package week2.d_221110.mission2_3;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Gamer g1 = new Gamer();
        Memento m = Memento.getInstance();
        StringBuilder [] fruit = {new StringBuilder("사과"),new StringBuilder("샤인머스켓"),new StringBuilder("귤")};
        int k =0;
        int apple =0;
        int shineMuscket = 0;
        int mandarine = 0;

        loop_exit :
        for(int i =0; i<100; i++){
            Random random = new Random();
            int diceNum = random.nextInt(6)+1;
            if(diceNum ==1 || diceNum ==3){
                g1.setMoney(g1.getMoney()+100);
            }else if(diceNum == 2 || diceNum ==4){
                g1.setMoney(g1.getMoney()/2);

            }else{
                int j = k%3;
                // j = 0, 1, 2 ...
                if(j==0) apple++;
                if(j==1) shineMuscket++;
                if(j==2) mandarine++;
                k++;
            }
            g1.showGamerInfo();

            // Gamer의 돈이 없어질 경우, for문 탈출
            if(g1.getMoney()<=0){
                System.out.println("Gamer가 파산했습니다.");
                break loop_exit;
            }
            // Gamer의 돈이 Memento의 돈보다 많을 경우, Memento 객체에 저장
            if(g1.getMoney()>m.getMoney()){
                g1.createMemento();
            }else if(g1.getMoney()<m.getMoney()/2){
                g1.restoreMemento(Memento.getInstance());
            }
        }
        g1.setHaveFruit(g1.getHaveFruit().append("사과: "+apple+"개, 샤인머스켓: "+shineMuscket+"개, 귤: "+mandarine+"개"));

    }
}
