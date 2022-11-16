package week2.d_221110.mission2_3_RefactoringByMyself.mission2_3;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Gamer g1 = new Gamer();
        Memento m = Memento.getInstance();
        int k =0;
        int apple =0;
        int shineMuscket = 0;
        int mandarine = 0;

        HashMap<String, Integer> fruits = new HashMap<>();
        g1.setHaveFruit(fruits);


        loop_exit :
        for(int i =0; i<100; i++){
            Random random = new Random();
            int diceNum = random.nextInt(6)+1;
            if(diceNum ==1 || diceNum ==3){
                g1.setMoney(g1.getMoney()+100);
            }else if(diceNum == 2 || diceNum ==4){
                g1.setMoney(g1.getMoney()/2);

            }else if(diceNum ==6){
                int j = k%3;
                // j = 0, 1, 2 ...
                if(j==0) apple++;
                if(j==1) shineMuscket++;
                if(j==2) mandarine++;
                fruits.put("사과",apple);
                fruits.put("샤인머스켓",shineMuscket);
                fruits.put("귤",mandarine);
                k++;
            }
//            g1.showGamerInfo();
            System.out.println("Gamer의 남은돈은 "+g1.getMoney()+"입니다.");
            for(String s : g1.fruits.keySet()){
                System.out.print("과일은 "+s+" "+g1.fruits.get(s)+"개입니다.\n");
//                System.out.println();
            }


//            Set set = fruits.entrySet();
//            Iterator it = set.iterator();
//            while(it.hasNext()){
//                Map.Entry e = (Map.Entry)it.next();
//                System.out.print("Gamer의 남은돈은 "+g1.getMoney()+"이고,");
//                System.out.println("과일은 "+e.getKey()+","+e.getValue()+"개입니다.");
//
//            }


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

    }
}
