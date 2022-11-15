package week3.d_221114.Mission1_2.abstract_Class;

public class Latte extends Coffee2{
    Latte(Coffee coffee){
        super(coffee);
    }

    @Override
    public String getBean() {
        return super.getBean();
    }

    @Override
    public void brewing() {
        super.brewing();
//         추상메서드는 하위 클래스에서 재정의해줘야 하므로 위와 같이 작성해주는 것이 불가
        System.out.print("Adding Milk");

    }


}
