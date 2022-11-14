package week3.d_221114.Mission1_1;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<Customer> customerList = new ArrayList<>();
        customerList.add(new REDCustomer("James",10000,2));
        customerList.add(new REDCustomer("Tomas",30000,2));
        customerList.add(new PLATINUMCustomer("Edward",10000,2));
        customerList.add(new PLATINUMCustomer("Percy",30000,2));
        customerList.add(new DIAMONDCustomer("Elizabet",30000,2,"Tom"));
        for(Customer c : customerList){
            c.showCustomerInfo();
        }


    }
}
