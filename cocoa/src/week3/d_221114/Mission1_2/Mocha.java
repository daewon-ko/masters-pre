package week3.d_221114.Mission1_2;

public class Mocha extends Coffee{


    // 기본 생성자
    Mocha(){}

    Mocha(Coffee coffee){
        super(coffee);

    }

    void brewing() {
        super.brewing();
        System.out.print(                                                                                                                                                                                                          " Adding Mocha Syrup");
    }



}
