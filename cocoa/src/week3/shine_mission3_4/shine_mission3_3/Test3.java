package week3.shine_mission3_4.shine_mission3_3;

public class Test3 {
    public static void main(String[] args) {
        PositivePoint p = new PositivePoint();

        p.move(10,10);
        System.out.println(p.toString());

        p.move(-5,-5);
        System.out.println(p.toString());

        PositivePoint p2 = new PositivePoint(-10,-10);
        System.out.println(p2.toString());

    }
}
