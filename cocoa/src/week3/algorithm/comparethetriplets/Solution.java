package week3.algorithm.comparethetriplets;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.compareTriplets(a, b);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }

    class Result {

      List<Integer> a = new ArrayList<>();
      List<Integer> b = new ArrayList<>();




        /*
         * Complete the 'compareTriplets' function below.
         *
         * The function is expected to return an INTEGER_ARRAY.
         * The function accepts following parameters:
         *  1. INTEGER_ARRAY a
         *  2. INTEGER_ARRAY b
         */
        public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
            List<Integer> result = new ArrayList<>();

            for(int i =0; i<3; i++) {
            Scanner sc = new Scanner(System.in);
                int a_input = sc.nextInt();
                a.add(a_input);
            }
            for(int i =0; i<3; i++) {
                Scanner sc = new Scanner(System.in);
                int b_input = sc.nextInt();
                b.add(b_input);
            }
            for(int i=0; i<3; i++){
                if(a.get(i)>b.get(i)){
                    int number1 = result.get(0)+1;
                    result.add(number1);
                }else if(a.get(i)<b.get(i)){
                    int number2 = result.get(1)+1;
                    result.add(number2);
                }
            }


                return result;
        }

    }
}





