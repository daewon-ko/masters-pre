package week4.d221121.mission1_1;

import week4.d221121.Grade;
import week4.d221121.Member;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MemberShipManagementList {

    private List<Member> memberList;

    public MemberShipManagementList(){
        this.memberList = new ArrayList<>();
    }

    public void addMemberShip(int id, String name, Grade grade){
        this.memberList.add(new Member(id, name, grade));
    }
    public boolean removeMember(int id){
        Iterator<Member> ir = memberList.iterator();

        while(ir.hasNext()){
            Member member = ir.next();
            int tempID = member.getMemberID();
            if(tempID == id){
                memberList.remove(member);
                return true;
            }
        }
        System.out.println("해당하는 회원정보가 없습니다.");
        return false;
    }

    public void showAllMember(){
        System.out.println("===================================");
        for(Member m : memberList){
            System.out.println(m);
        }
        System.out.println();
    }
}
