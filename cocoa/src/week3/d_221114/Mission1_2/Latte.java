package week3.d_221114.Mission1_2;

public class Latte extends Coffee{



    // 재정의하기 위한 생성자
    Latte(Coffee coffee){
        super(coffee);
    }


    @Override
    void brewing() {
        super.brewing();
        System.out.print(" Adding Milk");
    }
}
