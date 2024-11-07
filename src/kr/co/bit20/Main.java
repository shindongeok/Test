package kr.co.bit20;

import java.util.InputMismatchException;
import java.util.Scanner;

//예외처리02
public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int[] n = new int[5];
        int cnt = 0;
        int sum = 0;

        while (cnt<5){
            try{
                System.out.println((cnt+1) + "번째 점수");
                n[cnt] = s.nextInt();   //벼엘이 [0]부터 입력함 ----점수만 썻을 경우
                sum+=n[cnt];
                cnt++;
            }catch (InputMismatchException e){
                System.out.println("다시 입력해주세요 정수가 아님!!");
                s.next();   //잘못입력시 앞 토큰(데이터) 지우기
                // a 1 2 3 4 [0] 자리 데이터를 지우고 그다음 데이터가 [0]에 들어감
                continue;
            }
        }
        System.out.println(sum);
    }
}
// next() , nextLine 차이 알아보자.