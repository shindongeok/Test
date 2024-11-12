package text01.test23;


import java.util.InputMismatchException;
import java.util.Scanner;

class Calc{
    int a;

    int calculate(){
       Scanner s= new Scanner(System.in);

       int sum = 0;
        System.out.println("정수 입력");
        while (true) {
            a = s.nextInt();
            if (a >= 5 && a >= 10) {
                for(int i=1; i<a; i++){
                    if(i % 2 == 1){
                        sum+=i;
                    }
                }
                return sum;
            }else{
                System.out.println("다시 입력");
            }

        }

    }
}
public class Main {
    public static void main(String[] args){
        //1. 5부터 10까지의 정수형 데이터를 입력받아
        // 5~10이외의 정수형이 입력되면 “다시입력”이라고출력한다.
        // 입력받은 정수값을Calc class의calculate()함수를 이용하여
        // 1부터 입력받은숫자까지 홀수만 더하는 프로그램을작성해라.
        // (calculate()함수는 int형정수를 입력받아 1부터입력받은숫자까지 홀수의합을 구하여 리턴하는 함수)
        Calc c = new Calc();
        System.out.println(c.calculate());





    }
}
