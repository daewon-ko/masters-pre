package mission1_1;

import java.util.ArrayList;

public class mission1_AnotherWay {
    public static void main(String[] args) {
        ArrayList<Character> alphabets = new ArrayList<>();
        for(int i=0; i<26; i++){
            alphabets.add((char)(i+65));
        }

        for(int i=0; i< alphabets.size(); i++){
            System.out.println(alphabets.get(i));
        }
    }
}
