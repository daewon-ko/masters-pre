package week3.d_221117.Mission2_1;

public class BeginnerLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("jump 할 수 없습니다.");
    }

    @Override
    public void turn() {
        System.out.println("Turn 할 지 모릅니다.");

    }

    @Override
    public void showLevelMessage() {
        System.out.println("초보입니다.");
    }
}
