package test.p735;

import java.util.stream.IntStream;

//숫자 범위로부터 스트림 얻기
public class Stream735 {
    public  static  int sum;
    public static void main(String[] args) {

        IntStream stream = IntStream.rangeClosed(1,100);
        stream.forEach(a -> sum += a);
        System.out.println("총합: " + sum);
    }
}

