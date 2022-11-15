package week3.d_221114.Mission1_2;

public class Coffee {
    private Coffee coffee;
    public String bean;
    // bean을 static으로 선언해서 하위 클래스의 하위클래스 등에서도 접근 가능하게 설정
    // 하위 상속받는 클래스들에서 정의


    public Coffee(){}

    public Coffee(Coffee coffee){
      this.coffee =coffee;
    }



    void brewing(){
        coffee.brewing();
//        System.out.print(this.bean);

    }
}
