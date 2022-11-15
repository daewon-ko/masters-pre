package week3.d_221114.Mission1_2;

public class WhippedMocha extends Coffee{

    WhippedMocha(Coffee coffee){
        super(coffee);
    }

    @Override
    void brewing() {
        super.brewing();
        System.out.print("Adding WhippedCream");
    }
}
