package week3.d_221114.Mission1_2;

public class HawaiiAmericano extends Coffee {
    String bean = "HawaiiAmericano";
    HawaiiAmericano(){
    }

    @Override
    void brewing() {
        System.out.print(bean);
    }
}
