package javabaseballplayground;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class BaseBall {


        public static void baseball(){
            Random random = new Random();
            HashSet<Integer> hashSet = new HashSet<>();
            while(hashSet.size()<3){
                int ran = random.nextInt(9);
                hashSet.add(ran);
                System.out.println(hashSet);
            }
//        System.out.println(hashSet);
            Iterator<Integer> ir = hashSet.iterator();
            while(ir.hasNext()){
                int number = ir.next();
                System.out.println(number);
            }
            // 서로다른 3개의 수를 어떻게 표현하지? 동일한 수가 있을 수도 있는데?
            Scanner sc = new Scanner(System.in);
            System.out.print("숫자를 입력해주세요 : ");
//            String number = sc.nextLine();

        }
    }


