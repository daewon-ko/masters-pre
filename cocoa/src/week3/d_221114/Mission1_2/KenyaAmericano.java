package week3.d_221114.Mission1_2;

public class KenyaAmericano extends Coffee{
    String bean = "KenyaAmericano";
    KenyaAmericano(){
    }

    @Override
    void brewing() {
        System.out.print(bean);
    }
}
