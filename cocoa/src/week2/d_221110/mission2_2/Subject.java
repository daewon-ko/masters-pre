package week2.d_221110.mission2_2;

import java.util.ArrayList;

public class Subject {
    String name;
    int score;

    public int getScore() {
        return score;
    }

    Subject(String name, int score){
        this.name =name;
        this.score =score;
    }


//    int kor;
//    int math;
//    int english;
//    int total;
//    int avg;
//    int subject_cnt=0;
//
//    // 생성자 정의
//    // 과목이 확장되면 어떻게 하지 ?
//    // 과목이 추가 ? 확장성 있는 코드 작성을 위하여 어떻게 작성하는게 좋을까?
//    //
//
//    Subject(int kor, int math){
//        this.kor = kor;
//        this.math =math;
//        for(int i=0; i<2; i++){
//            subject_cnt++;
//        }
//    }
//
//    Subject(int kor, int math, int english){
//        this(kor, math);
//        this.english= english;
//        subject_cnt++;
//    }
//
//
//    // 총점 및 평균 점수 확인 기능메서드
//    public void showScore(){
//
//        total = this.kor + this.math + this.english;
//        double avg = (double)(total/subject_cnt);
//        System.out.println("총점은 "+total+"이고, 평균은 "+avg+"입니다.");
//    }

}
