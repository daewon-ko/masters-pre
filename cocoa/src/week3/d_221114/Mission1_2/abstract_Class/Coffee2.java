package week3.d_221114.Mission1_2.abstract_Class;

public abstract class Coffee2 extends Coffee{
    String bean;
    Coffee coffee;

    public Coffee2(Coffee coffee) {
        this.coffee = coffee;

    }

    public String getBean(){
        return bean;
    }
    public  void brewing(){
        coffee.brewing();
    }
}
