package week3.d_221114.Mission1_2.abstract_Class;

public class BrazilAmericano extends Coffee{

    public BrazilAmericano() {
        bean = "BrazilAmericano";
    }

    @Override
    public String getBean() {
        return bean;
    }

    @Override
    public void brewing() {
        System.out.print(bean);

    }
}
