package week3.d_221117.Mission2_1.gamelevel;

public abstract class PlayerLevel{
    PlayerLevel ADVANCED_LEVEl;

    public abstract void run();
    public abstract void jump();
    public abstract void turn();

    public abstract void showLevelMessage();

    final public void go(int count){
        run();
        for( int i =0; i<count; i++){
            jump();

        }
        turn();
    }


}
