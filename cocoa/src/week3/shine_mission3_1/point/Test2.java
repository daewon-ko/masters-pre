package week3.shine_mission3_1.point;

public class Test2 {
    public static void main(String[] args) {
        ColorPoint zeroPoint = new ColorPoint(); // 0,0 위치의 BLACk점
        System.out.println(zeroPoint.toString()+"입니다.");

        ColorPoint cp = new ColorPoint(10,10);
        cp.setXY(5,5);
        cp.setColor("RED");
        System.out.println(cp.toString());
    }
}
