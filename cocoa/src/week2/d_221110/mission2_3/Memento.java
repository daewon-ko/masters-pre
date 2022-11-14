package week2.d_221110.mission2_3;

public class Memento {
    // 멤버변수가 static으로 구성해서 생성자에 넣을 시
    // Getter가 접근하지 못한다.
    // Getter가 접근하지 못하면, createMememento 메서드를 Gamer클래스에서 이용 시,
    // 변수 값을 Memmento 값에 저장을 해줄 수가 없음.
    private int money;
    private  StringBuilder haveFruit= new StringBuilder();
    private static Memento instance = new Memento();

    private Memento() { }
    public static Memento getInstance(){
        if(instance ==null){
            instance = new Memento();
        }
        return instance;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setHaveFruit(StringBuilder haveFruit) {
        this.haveFruit = haveFruit;
    }

    public int getMoney() {
        return money;
    }

    public StringBuilder getHaveFruit() {
        return haveFruit;
    }
}
