package week2.d_221110.mission2_3;

public class Gamer {
    private int money= 1000;
    // haveFruit을 왜 StringBuilder로 해야하지?
    // String으로 하면 안되는 이유는 ?
    private StringBuilder haveFruit= new StringBuilder();



    public int getMoney() {
        return money;
    }

    public StringBuilder getHaveFruit() {
        return haveFruit;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setHaveFruit(StringBuilder haveFruit) {
        this.haveFruit = haveFruit;
    }

    public Memento createMemento(){
        // Memmento 객체를 계속 생성하는 것 아닌가?
        // 아래와 같이 설정하면 새로 설정하는 것은 아님..
        // setter를 통하여 mememento의 멤버 변수값을 변경 시,
        // 캡슐화에 위배되는 것이 아니던가?

        Memento m = Memento.getInstance();
        m.setMoney(this.money);
        m.setHaveFruit(this.haveFruit);
        return m;
    }

     public void restoreMemento(Memento m){
        m = Memento.getInstance();
        this.money =m.getMoney();
        this.haveFruit = m.getHaveFruit();
     }

     public void showGamerInfo(){
         System.out.println("Gamer의 남은 돈은 "+this.money+"이고, 과일은 "+this.haveFruit+"입니다.");

     }
}
