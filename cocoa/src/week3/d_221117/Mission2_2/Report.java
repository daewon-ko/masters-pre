package week3.d_221117.Mission2_2;


public class Report {
    public static void main(String[] args) {
        Student Kang = new Student("강감찬", 211213);
        Kang.addSubject("국어", 95);
        Kang.addSubject("수학", 56);

        Student Kim = new Student("김유신", 212330);
        Kim.addSubject("국어", 95);
        Kim.addSubject("수학", 98);

        Student Sin = new Student("신사임당", 201518);
        Sin.addSubject("국어", 100);
        Sin.addSubject("수학", 88);

        Student Lee = new Student("이순신", 202360);
        Lee.addSubject("국어", 89);
        Lee.addSubject("수학", 95);

        Student Hong = new Student("홍길동", 201290);
        Hong.addSubject("국어", 83);
        Hong.addSubject("수학", 56);

        GradeEvaluation nonMajor = new BasicEvaluation();
        GradeEvaluation haveMajor = new MajorEvaluation();

        // 국어에서는 Subject를 뽑을 떄 첫번쨰 배열의 요소(0번 인덱스)를 뽑는다.
        System.out.println("--------------------------");
        StringBuilder sb = new StringBuilder();
        sb.append("\t\t국어\t");
        sb.append("수강생\t");
        sb.append("학점\n");
        System.out.println();
        sb.append("이름\t\t학번\t\t중점과목\t\t점수\n");
        System.out.println("--------------------------");
        sb.append(Kang.getName() + "\t" + Kang.getStudentID() + "\t" + Major.국어국문학과.getEssentialSub() + "\t\t"
                + Kang.subjectList.get(0).getScore() + ":" + haveMajor.getGrade(Kang.subjectList.get(0).getScore()) + "\n");
        sb.append(Kim.getName() + "\t" + Kim.getStudentID() + "\t" + Major.컴퓨터공학과.getEssentialSub() + "\t\t"
                + Kim.subjectList.get(0).getScore() + ":" + nonMajor.getGrade(Kim.subjectList.get(0).getScore()) + "\n");
        sb.append(Sin.getName() + "\t" + Sin.getStudentID() + "\t" + Major.국어국문학과.getEssentialSub() + "\t\t"
                + Sin.subjectList.get(0).getScore() + ":" + haveMajor.getGrade(Sin.subjectList.get(0).getScore()) + "\n");
        sb.append(Lee.getName() + "\t" + Lee.getStudentID() + "\t" + Major.국어국문학과.getEssentialSub() + "\t\t"
                + Lee.subjectList.get(0).getScore() + ":" + haveMajor.getGrade(Lee.subjectList.get(0).getScore()) + "\n");
        sb.append(Hong.getName() + "\t" + Hong.getStudentID() + "\t" + Major.컴퓨터공학과.getEssentialSub() + "\t\t"
                + Hong.subjectList.get(0).getScore() + ":" + nonMajor.getGrade(Hong.subjectList.get(0).getScore()) + "\n");
        System.out.println(sb);


        System.out.println();

        // 수학에서는 Subject를 뽑을 떄 첫번쨰 배열의 요소(0번 인덱스)를 뽑는다.

        StringBuilder sb2 = new StringBuilder();
        sb2.append("\t\t수학\t");
        sb2.append("수강생\t");
        sb2.append("학점\n");
        System.out.println();
        sb2.append("이름\t\t학번\t\t중점과목\t\t점수\n");
        System.out.println("--------------------------");
        sb2.append(Kang.getName() + "\t" + Kang.getStudentID() + "\t" + Major.국어국문학과.getEssentialSub() + "\t\t"
                + Kang.subjectList.get(1).getScore() + ":" + nonMajor.getGrade(Kang.subjectList.get(1).getScore()) + "\n");
        sb2.append(Kim.getName() + "\t" + Kim.getStudentID() + "\t" + Major.컴퓨터공학과.getEssentialSub() + "\t\t"
                + Kim.subjectList.get(1).getScore() + ":" + haveMajor.getGrade(Kim.subjectList.get(1).getScore()) + "\n");
        sb2.append(Sin.getName() + "\t" + Sin.getStudentID() + "\t" + Major.국어국문학과.getEssentialSub() + "\t\t"
                + Sin.subjectList.get(1).getScore() + ":" + nonMajor.getGrade(Sin.subjectList.get(1).getScore()) + "\n");
        sb2.append(Lee.getName() + "\t" + Lee.getStudentID() + "\t" + Major.국어국문학과.getEssentialSub() + "\t\t"
                + Lee.subjectList.get(0).getScore() + ":" + nonMajor.getGrade(Lee.subjectList.get(0).getScore()) + "\n");
        sb2.append(Hong.getName() + "\t" + Hong.getStudentID() + "\t" + Major.컴퓨터공학과.getEssentialSub() + "\t\t"
                + Hong.subjectList.get(1).getScore() + ":" + haveMajor.getGrade(Hong.subjectList.get(1).getScore()) + "\n");
        System.out.println(sb2);


    }
}
