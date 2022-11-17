package week3.d_221117.Mission2_1;

public class Player {
    private Player player;
    private static PlayerLevel pLevel;
    public static AdvancedLevel ADVANCED_LEVEL = new AdvancedLevel();
    public static SuperLevel SUPER_LEVEL = new SuperLevel();

    Player() {
        pLevel = new BeginnerLevel();
        pLevel.showLevelMessage();
    }


    public PlayerLevel getLevel() {
        return pLevel;
    }

    public void UpgradeLevel(PlayerLevel pLevel) {
        this.pLevel = pLevel;
        pLevel.showLevelMessage();
    }

    public void play(int count) {
        pLevel.go(count);

    }
}


