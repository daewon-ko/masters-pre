package week3.d_221117.Mission2_2;

public enum Major {

    컴퓨터공학과("수학"), 국어국문학과("국어");
    private String essentialSub;
    private String computer = "컴퓨터공학과";
//    private int score;

    Major(String essentialSub){
        this.essentialSub = essentialSub;
//        this.score = score;
    }
//    public String throwMajor(int num){
//        String major = null;
//        if(num ==1) major = "컴퓨터 공학과";
//        if(num ==2) major = "국어국문학과";
//        return major;
//    }
    public String getEssentialSub() {
        return essentialSub;
    }
}
