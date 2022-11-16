package week3.shine_mission3_1.point;

public class ColorPoint extends Point{
    int x;
    int y;
    String color = "BLACK";
    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color =color;
    }
    // (0,0) 위치의 black 색 점
    public ColorPoint(){
        super(0,0);
    }
    public ColorPoint(int x, int y){
        super(x,y);
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void setColor(String color){
        this.color =color;
    }
    public String toString(){
        return color+"색의 "+"("+x+", "+y+")"+"의 점";
    }
}
