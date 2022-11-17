package week3.d_221117.Mission2_1;

public class Test {
    public static void main(String[] args) {
        Player player = new Player();
        player.play(1);
        player.UpgradeLevel(Player.ADVANCED_LEVEL);
        player.play(2);
        player.UpgradeLevel(Player.SUPER_LEVEL);
        player.play(30);

    }
}
