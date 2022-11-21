package week4.d221121.mission1_4;

import week4.d221121.Grade;
import week4.d221121.Member;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberShipManagementTreeSet {
    private TreeSet<Member> treeSet;

    public MemberShipManagementTreeSet() {
        this.treeSet = new TreeSet<>();
    }

    public void addMemberShip(int id, String name, Grade grade) {
        this.treeSet.add(new Member(id, name, grade));
    }

    public boolean removeMember(int id){
        Iterator<Member> ir = treeSet.iterator();
        while (ir.hasNext()){
            Member member = ir.next();
            if(member.getMemberID() == id){
                treeSet.remove(member);
                return true;
            }
        }
        System.out.println("해당하는 ID가 존재하지 않습니다.");
        return false;
    }

    public void showALlMember(){
        System.out.println("=========================");
        for(Member m : treeSet){
            System.out.println(m);
        }
        System.out.println();
    }
}
