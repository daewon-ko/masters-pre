package week3.d_221114.Mission1_2.abstract_Class;

public class Test {
    public static void main(String[] args) {
        Coffee etiopiaAmercano = new EtiopiaAmericano();
        etiopiaAmercano.brewing();
        System.out.println();

        Coffee kenyaAmericano = new KenyaAmericano();
        kenyaAmericano.brewing();
        System.out.println();

        Coffee kenyaLatte = new Latte(kenyaAmericano);
        kenyaLatte.brewing();
        System.out.println();

        Coffee brazilMocha = new Mocha(new Latte(new BrazilAmericano()));
        brazilMocha.brewing();
        System.out.println();

        Coffee hawaiiWhippedMocha = new WhippedCream(new Mocha(new Latte(new HawaiiAmericano())));
        hawaiiWhippedMocha.brewing();
        System.out.println();
    }
}
