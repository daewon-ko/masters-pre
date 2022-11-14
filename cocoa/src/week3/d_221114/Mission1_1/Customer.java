package week3.d_221114.Mission1_1;

public class Customer {
    protected String customerName;
    int parkingFee;
    double saleRatio;
    double pointRatio;
    int stayHour;
    int shoppingPrice;


    Customer(String customerName, int shoppingPrice, int stayHour){
        this.customerName = customerName;
        this.shoppingPrice = shoppingPrice;
        this.stayHour =stayHour;

    }
    public int calcPrice(){
        int payPrice;
        payPrice = shoppingPrice -(int)(saleRatio*shoppingPrice);
        return payPrice;
    }

    public void showCustomerInfo(){
        System.out.println(customerName+"님의 지불 금액은"+calcPrice()+"이고, 적립 포인트는"+(int)(shoppingPrice*pointRatio)+"입니다.");
        System.out.println("주차 금액은 "+stayHour*parkingFee+"입니다.");
    }



}
