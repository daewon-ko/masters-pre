package week3.shine_mission3_4.shine_mission3_3;

public class PositivePoint extends Point {
    int x;
    int y;
    int z;

    PositivePoint(){
        super();
        this.x = 0;
        this.y = 0;
    }

    PositivePoint(int x, int y){
        x = this.x+x;
        y = this.y+y;
    }


    public String toString(){
        return "("+this.x+", "+this.y+")"+"의 점입니다.";
    }

    @Override
    protected void move(int x, int y) {
        if(x<0 || y<0){
            x = this.x;
            y = this.y;
            return ;
            // 무효화시키는 것?
        }
        super.move(x, y);
        this.x = x;
        this.y = y;
    }
}
