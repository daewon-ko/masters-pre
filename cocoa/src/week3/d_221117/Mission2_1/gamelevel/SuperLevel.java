package week3.d_221117.Mission2_1.gamelevel;

public class SuperLevel extends PlayerLevel{

    @Override
    public void run() {
        System.out.println("아주 빨리 달립니당.");
    }

    @Override
    public void jump() {
        System.out.println("높이 jump 합니다.");

    }

    @Override
    public void turn() {
        System.out.println("Turn 할 수 있습니당");

    }

    @Override
    public void showLevelMessage() {
        System.out.println("고급자 입니당");
    }
}
