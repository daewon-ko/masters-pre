package week2.d_221110.mission2_1;

public class Test2 {
    public static void main(String[] args) {

                HyundaiFactory factory = HyundaiFactory.getFactory();
                HyundaiFactory factory1 = HyundaiFactory.getFactory();

        System.out.println(factory1);
        System.out.println(factory);
                Car myCar = factory.createCar();
                Car yourCar = factory.createCar();

                System.out.println(myCar.showCarNumber());
                System.out.println(yourCar.showCarNumber());
        System.out.println(myCar.hashCode());
        System.out.println(yourCar.hashCode());
            }
        }


