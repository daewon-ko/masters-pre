package week3.d_221114.Mission1_2.abstract_Class;

public class WhippedCream extends Coffee2{


    public WhippedCream(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void brewing() {
        super.brewing();
        System.out.print("Adding WhippedCream");
    }
}
