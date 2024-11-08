package kr.co.bit28;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        //#을 기준으로 문자열 나누기
        String str = "id=123#name=gildong#addr=seoul";

        //지정한 # 기준으로 토큰을 나눔
        StringTokenizer s =new StringTokenizer(str, "#");
        //토큰이 몇개인가
        int n=s.countTokens();
        System.out.println(n);

        while (s.hasMoreTokens()){
            String a =s.nextToken();
            System.out.println(a);
        }

    }
}
