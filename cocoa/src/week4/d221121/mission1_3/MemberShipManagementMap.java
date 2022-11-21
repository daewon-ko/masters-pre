package week4.d221121.mission1_3;

import week4.d221121.Grade;
import week4.d221121.Member;

import java.util.HashMap;
import java.util.Iterator;

public class MemberShipManagementMap {
    private HashMap<Integer, Member> hashMap;

    public MemberShipManagementMap() {
        this.hashMap = new HashMap<>();
    }
    public void addMemberShip(int id, String name, Grade grade){
        this.hashMap.put(id,new Member(id,name,grade));
    }
    public boolean removeMember(int ID){
        if(hashMap.containsKey(ID)){
            hashMap.remove(ID);
            return true;
        }
        System.out.println("해당하는 회원이 없습니다.");
        return false;
    }
    public void showAllMember(){
        Iterator<Integer> ir = hashMap.keySet().iterator();
        while (ir.hasNext()){
            int key = ir.next();
            Member member = hashMap.get(key);
            System.out.println(member);
        }
        System.out.println();
    }
}
