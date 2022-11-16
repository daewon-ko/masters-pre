package week3.shine_mission3_3;

public class Point3D extends Point{
    int x;
    int y;
    int z;
    public Point3D(int x, int y, int z) {
        super(x, y);
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String toString(){
        return "("+x+", "+y+", "+z+")"+"의 점입니다.";
    }

    public void moveup(){
        z++;
    }

    protected void move(int x, int y, int z) {
        super.move(x, y);
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
