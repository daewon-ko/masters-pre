package week2.d_221110.mission2_3_RefactoringAgain;

import java.util.HashMap;

public class Memento {
    private int money = 1000;
    private HashMap<String,String > haveFrutis = new HashMap<>();

    public int getMoney() {
        return money;
    }

    public HashMap<String, String> getHaveFrutis() {
        return haveFrutis;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setHaveFrutis(HashMap<String, String> haveFrutis) {
        this.haveFrutis = haveFrutis;
    }
}
