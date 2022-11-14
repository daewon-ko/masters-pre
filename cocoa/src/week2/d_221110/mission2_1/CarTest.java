package week2.d_221110.mission2_1;

public class CarTest {

    public static void main(String[] args) {
        HyundaiFactory factory = HyundaiFactory.getFactory();
        Car myCar = factory.createCar();
        Car yourCar = factory.createCar();
        System.out.println("첫번째 차 번호는 :"+ myCar.showCarNumber());
        System.out.println("첫번째 차 번호는 :"+ yourCar.showCarNumber());
    }



}
