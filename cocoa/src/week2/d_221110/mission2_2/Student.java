package week2.d_221110.mission2_2;

import java.util.ArrayList;

public class Student {
    String  studentName;
    String major;
    int studentID;
    static int serialNum=1000;
    ArrayList<Subject> subject;

    public void addSubject(String name, int score){
        Subject s = new Subject(name, score);
        this.subject.add(s);
    }

    Student(String studentName, String major){
        this.major = major;
        this.studentName = studentName;
        serialNum++;
        studentID = serialNum;
        subject = new ArrayList<>();

    }

    public void showStudentInfo(){
        int total=0;
        int avg = 0;
        System.out.println(studentName+" 학생은 "+subject.size()+"과목을 수강했습니다.");
        for(Subject s : subject){
            total+=s.getScore();
            avg = total/ subject.size();
        }
        System.out.println("총점은 "+total+"점이고, 평균은 "+avg+"점입니다.");
    }

}
