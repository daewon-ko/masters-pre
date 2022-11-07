package mission1_1;

import java.util.Arrays;

public class mission1 {
    public static void main(String[] args) {
        char[] alphabets = new char[26];
        // 65 ~90
        // 배열에 저장
        for(int i =0; i<alphabets.length; i++){
            alphabets[i]= (char)(i+65);
        }

        for(int i=0; i<alphabets.length; i++){
            System.out.println(alphabets[i]);
        }
    }
}
