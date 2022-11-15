package week3.d_221114.Mission1_2;

public class EthiopiaAmericano extends Coffee{
    String bean = "EthiopiaAmericano";

    EthiopiaAmericano(){
        super.bean = bean;
    }

    @Override
    void brewing() {
        System.out.print(bean);
    }
}
