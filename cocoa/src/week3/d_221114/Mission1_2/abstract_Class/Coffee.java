package week3.d_221114.Mission1_2.abstract_Class;

public abstract class Coffee {
    String bean;
    Coffee coffee;

    public Coffee(){
    }

    public Coffee(Coffee coffee) {
        this.coffee = coffee;

    }

    public String getBean(){
        return bean;
    }
    public abstract void brewing();
}
