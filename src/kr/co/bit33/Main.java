package kr.co.bit33;

import java.util.Random;

public class Main {
    public static void main(String[] args){

        System.out.println(Math.round(3.14));   //반올림
        System.out.println(Math.exp(2));    //e의 제곱
        System.out.println(Math.pow(2,10)); //
        System.out.println(Math.sqrt(9.0));

        Random r = new Random(10);
        int r2=r.nextInt(20)+1;
        System.out.println(r2);
        System.out.println();
    }
}
