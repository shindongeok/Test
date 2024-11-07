package kr.co.bit24;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //5. 무한루프안에 두 정수를 입력받아 합을 구하고,
        //실수를 입력하면 “실수는 안된다”라고 출력하고,
        //다시 두 정수를 입력받는 코드를 작성해라.
        //실행 결과) 두 정수 입력: 3 3.5
        //실수는 안된다
        //두 정수 입력: 3 5
        //답: 8
        Scanner s = new Scanner(System.in);
        int a= 0 ;
        int b=0;

        while (true){
            try{
                System.out.println("첫번 째 정수 입력 : ");
                a =s.nextInt();
                System.out.println("두번 째 정수 입력 : ");
                b =s.nextInt();


            }catch (Exception e){
                System.out.println("실수는 안된다.");
                continue;
            }
        }
    }
}
