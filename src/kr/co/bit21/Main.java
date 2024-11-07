package kr.co.bit21;

import java.util.InputMismatchException;
import java.util.Scanner;


class  Calc{
    public int calculate(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            if(n%2 == 0){
                continue;   // 2의 배수 제외
            }
            sum+=i;
        }
        return sum;
    }
}
public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        Calc c = new Calc();
        int n;

        // for문 무한 반복문
//        for(;;){
//
//        }
        while (true){
            //예외 코드 작성
            try{
                System.out.println("5~10 정수 입력 : ");
                n = s.nextInt();
                if(n>=5 && n<=10){  //5~10까지 잘 입력한 경우
                    break;  //무한 루프 종료.
                }
                System.out.println("다시 입력");    //5~10까지 수가 아닐경우
            }catch (InputMismatchException e){
                System.out.println("잘못 입력함");
                s.next();

            }
        }
        System.out.println(c.calculate(n));
    }
}
