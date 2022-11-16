package week3.shine_mission3_1.point;

import week3.d_221114.Mission1_2.Coffee;

public class Test {
    public static void main(String[] args) {
        ColorPoint cp = new ColorPoint(5,5,"Yellow");
        cp.setXY(10,20);
        cp.setColor("RED");
        String str = cp.toString();
        System.out.println(str+"입니다.");
    }
}
