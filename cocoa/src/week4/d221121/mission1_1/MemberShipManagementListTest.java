package week4.d221121.mission1_1;

import week4.d221121.Grade;
import week4.d221121.Member;

public class MemberShipManagementListTest {
    public static void main(String[] args) {
        MemberShipManagementList management = new MemberShipManagementList();
        management.addMemberShip(1001,"Hong", Grade.SILVER);
        management.addMemberShip(1002,"Park", Grade.VIP);
        management.addMemberShip(1003,"Kim", Grade.PLATINUM);

        System.out.println("모든 멤버 보여주기: ");
        management.showAllMember();

        System.out.println("존재하는 아이디를 지웠을 떄 : ");
        if(management.removeMember(1001)){
            management.showAllMember();
        }
        System.out.println("존재하지 않는 아이디를 지우려 했을 때 :");
        if(management.removeMember(1005)){
            management.showAllMember();
        }
    }
}
