package week3.d_221114.Mission1_1;

public class DIAMONDCustomer extends Customer {
    private String consultant;


    DIAMONDCustomer(String customerName, int shoppingPrice,int stayhour,String consultant) {
        super(customerName, shoppingPrice,stayhour);
        this.saleRatio = 0.1;
        this.pointRatio =0.1;
        this.consultant = consultant;
        this.parkingFee = 0;
    }
}
