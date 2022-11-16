package week3.shine_mission3_3;

public class Test3 {
    public static void main(String[] args) {
        Point3D p = new Point3D(1,2,3);
        System.out.println(p.toString());

        p.moveup();
        p.move(10,10);
        System.out.println(p.toString());

        p.move(100,200,300);
        System.out.println(p.toString());

    }
}
