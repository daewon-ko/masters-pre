package week3.d_221117.Mission2_2;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int studentID;
    private Major major;
    List<Subject> subjectList = new ArrayList<>();

    public String getMajor(Major major) {
        return major.name();
    }


    Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    public void addSubject(String subjectName, int score) {
        Subject s = new Subject(subjectName, score);
        subjectList.add(s);
    }

    public String getName() {
        return name;
    }

    public int getStudentID() {
        return studentID;
    }
}
