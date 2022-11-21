package week4.d221121.mission1_4;

import week4.d221121.Grade;

public class MemberShipManagementTreeSetTest {
    public static void main(String[] args) {
        MemberShipManagementTreeSet management = new MemberShipManagementTreeSet();
        management.addMemberShip(1003, "Hong", Grade.SILVER);
        management.addMemberShip(1001, "Park", Grade.VIP);
        management.addMemberShip(1002, "Kim", Grade.PLATINUM);

        System.out.println("모든 멤버 보여주기: ");
        management.showALlMember();

        System.out.println("존재 하는 아이디를 지웠을때 :");
        if(management.removeMember(1001)) {
            management.showALlMember();
        }

        System.out.println("존재 하지 않는 아이디를 지우려 할때:");
        if(management.removeMember(1005)) {
            management.showALlMember();
        }


        System.out.println("이미 존재 하는 아이디를 추가하려 할때:");
//        management.addMemberShip(1002, "Lee", Grade.VIP);
        // 이름으로 비교하는 경우
        // System.out.println("이미 존재 하는 이름을 추가하려 할때:");
         management.addMemberShip(1002, "Kim", Grade.VIP);
        management.showALlMember();    }
}
