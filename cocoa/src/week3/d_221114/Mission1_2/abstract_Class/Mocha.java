package week3.d_221114.Mission1_2.abstract_Class;

public class Mocha extends Coffee2{
    public Mocha(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void brewing() {
        super.brewing();
        System.out.print("Adding Mocha Syrup");
    }
}
