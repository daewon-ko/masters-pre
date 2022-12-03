package week2.d_221110.mission2_3_RefactoringAgain;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Originator {
    private int money = 1000;
    private HashMap<String,String> haveFruits= new HashMap<>();
    // 객체 연관관계 설정(Memento 객체를 인스턴스변수화)
    private Memento m;
    private int cnt = 0;
    private int appleNum =0;
    private int shineMusketNum =0;
    private int tangerrineNum =0;


    // 1회용 호출(Memento객체 생성 호출)
    public void setMemento(Memento m){
       this.m = new Memento();
    }
    // 객체 협력관계설
    public Memento createMemento(){
        m.setHaveFrutis(haveFruits);
        m.setMoney(money);
        return m;
    }

    public void restoreMemento(){
        this.haveFruits = m.getHaveFrutis();
        this.money = m.getMoney();

    }


    public int getMoney() {
        return money;
    }

    public void getHaveFruits() {
        Set set = haveFruits.entrySet();
        Iterator it = set.iterator();
        while(it.hasNext()){
            Map.Entry e  =(Map.Entry)it.next();

            System.out.print(e.getKey()+": "+e.getValue()+"\t");
        }
//        return haveFruits;
    }
    public void addMoney(){
        this.money+=100;
    }

    public void halfMoney(){
        this.money= money/2;
    }
    public void takeFruit(){
        cnt++;
        if(cnt%3==1){
            appleNum++;
            haveFruits.put("사과",+appleNum+"개");
        }else if(cnt%3==2){
            shineMusketNum++;
            haveFruits.put("샤인머스켓",shineMusketNum+"개");
        }else {
        tangerrineNum++;
        haveFruits.put("귤",tangerrineNum+"개");

        }
    }


}
