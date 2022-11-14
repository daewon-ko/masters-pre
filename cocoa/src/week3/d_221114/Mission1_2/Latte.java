package week3.d_221114.Mission1_2;

public class Latte extends Coffee{
//    KenyaAmericano americano;
    Coffee kenyaAmericano;
    Latte(){
    }
    Latte(Coffee kenyaAmericano){
        this.kenyaAmericano =new KenyaAmericano();
    }

    @Override
    void brewing() {
        super.bean = "KenyaAmericano";
        System.out.print(this.bean+" Adding Milk");
    }
}
