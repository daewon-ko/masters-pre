package week2.d_221110.mission2_3_RefactoringAgain;

public enum Fruits {
    Apple("사과"), ShineMusket("포도"), Tangerine("귤");
    private int apple_Cnt = 0;
    private int shineMusket_Cnt = 0;
    private int tangerine_Cnt = 0;

    Fruits(String name) {

    }

    public int countApple() {
        apple_Cnt++;
        return apple_Cnt;

    }

    public int countShineMusket() {
        shineMusket_Cnt++;
        return shineMusket_Cnt;

    }

    public int countTangerine() {
        tangerine_Cnt++;
        return tangerine_Cnt;

    }


}
