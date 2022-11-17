package week3.d_221117.Mission2_1.gamelevel;

public class AdvancedLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("빠르게 달립니당");
    }

    @Override
    public void jump() {
        System.out.println("점프합니다.");
    }

    @Override
    public void turn() {
        System.out.println("Turn 할 지 모릅니다");

    }

    @Override
    public void showLevelMessage() {
        System.out.println("중급자입니당");
    }
}
