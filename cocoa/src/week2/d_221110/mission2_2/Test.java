package week2.d_221110.mission2_2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("Kim","수학");
        Student s2 = new Student("Lee","국어");
        s1.addSubject("국어",100);
        s1.addSubject("수학",100);
        s2.addSubject("국어",55);
        s2.addSubject("수학",55);
        s2.addSubject("영어",100);

        s1.showStudentInfo();
        s2.showStudentInfo();
    }
}
