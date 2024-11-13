package test.p734;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream734 {
    public static void main(String[] args) {
        String[] strArray = {"홍길동", "신용권", "김미나"};
        Stream<String> strStream = Arrays.stream(strArray);
        strStream.forEach(item -> System.out.print(item + ", "));
        System.out.println();

        for(int i=0; i<strArray.length; i++){
            System.out.print(strArray[i]+", ");
        }
        System.out.println();

        int[] intArray = {1, 2, 3, 5};
        IntStream intStream = Arrays.stream(intArray);
        intStream.forEach(item -> System.out.print(item + ", "));
        System.out.println();
    }
}
