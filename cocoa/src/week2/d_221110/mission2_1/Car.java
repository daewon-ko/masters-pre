package week2.d_221110.mission2_1;

public class Car {
    private int carNum;
    private static int serialNum=999;

    Car(){
        serialNum++;
        this. carNum = serialNum;
    }

    public int showCarNumber(){

        return  this.carNum;
    }
}
