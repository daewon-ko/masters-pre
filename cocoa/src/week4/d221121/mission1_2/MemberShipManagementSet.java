package week4.d221121.mission1_2;

import week4.d221121.Grade;
import week4.d221121.Member;

import java.util.HashSet;
import java.util.Iterator;

public class MemberShipManagementSet {
    private HashSet<Member> memberHashSet;

    MemberShipManagementSet() {
        memberHashSet = new HashSet<>();
    }

    public void addMemberShip(int id, String name, Grade grade) {
        memberHashSet.add(new Member(id,name,grade));
    }

    public boolean removeMember(int memberID){
        Iterator<Member> ir = memberHashSet.iterator();
        while (ir.hasNext()){
            Member member = ir.next();
            int tempID = member.getMemberID();
            if(tempID == memberID){
                memberHashSet.remove(member);
                return true;
            }
        }
        System.out.println("해당 ID는 존재하지 않습니다.");
        return false;
    }

    public void showAllMember(){
        System.out.println("=====================================");
        for(Member m : memberHashSet){
            System.out.println(m);
        }
        System.out.println();
    }

}
