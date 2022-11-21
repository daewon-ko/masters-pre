package week4.d221121;

public class Member {
    private String name;
    private int memberID;
    private Grade grade;

    public Member(int memberID, String name, Grade grade) {
        this.name = name;
        this.memberID = memberID;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getMemberID() {
        return memberID;
    }

    public Grade getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return name+"님의 아이디는"+memberID+"이고, 등급은"+grade+"입니다.";
    }
}
