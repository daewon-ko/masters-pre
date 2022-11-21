package week4.d221121;

import java.util.Objects;

public class Member implements Comparable<Member> {
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
        return name + "님의 아이디는" + memberID + "이고, 등급은" + grade + "입니다.";
    }


    @Override
    public boolean equals(Object o) {
        if (o instanceof Member) {
            Member member = (Member) o;
            if (this.memberID == member.memberID) {
                return true;
            } else return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return memberID;
    }

    @Override
//    public int compareTo(Member member) {
//        return (this.memberID - member.memberID);
//    }

    public int compareTo(Member member) {
        return this.name.compareTo(member.name);
    }
}
