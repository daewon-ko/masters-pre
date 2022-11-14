package week3.d_221114.Mission1_1;

public class REDCustomer extends Customer{

    REDCustomer(String customerName, int shoppingPrice,int stayhour) {
        super(customerName, shoppingPrice,stayhour);
        this.pointRatio = 0.01;
        this.parkingFee = 3000;
    }
}
