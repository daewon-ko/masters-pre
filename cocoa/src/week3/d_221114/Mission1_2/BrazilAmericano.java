package week3.d_221114.Mission1_2;

public class BrazilAmericano extends Coffee{

    String bean = "BrazilAmericano";
    BrazilAmericano(){
    }

    @Override
    void brewing() {
        System.out.print(bean);
    }
}
