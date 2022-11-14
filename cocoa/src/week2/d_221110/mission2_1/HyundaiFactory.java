package week2.d_221110.mission2_1;

public class HyundaiFactory {

    private static HyundaiFactory h;
    private HyundaiFactory(){}
    public static HyundaiFactory getFactory(){
        if(h == null){
            h= new HyundaiFactory();
        }
        return h;
    }

    public  Car createCar(){
        Car c = new Car();
        return c;
    }

}