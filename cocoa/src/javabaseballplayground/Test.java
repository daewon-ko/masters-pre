package javabaseballplayground;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        Iterator<Integer> ir = hashSet.iterator();
        Integer num = ir.next();
        Integer num2 = ir.next();
        Integer num3 = ir.next();
        System.out.println(num);
        System.out.println(num2);
        System.out.println(num3);



    }
}
