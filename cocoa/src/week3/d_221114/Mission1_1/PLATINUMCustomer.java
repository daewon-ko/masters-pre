package week3.d_221114.Mission1_1;

public class PLATINUMCustomer extends Customer{
    PLATINUMCustomer(String customerName, int shoppingPrice, int stayhour) {
        super(customerName, shoppingPrice,stayhour);
        this.saleRatio = 0.05;
        this.pointRatio = 0.05;
        this.parkingFee = 1000;

    }

}
