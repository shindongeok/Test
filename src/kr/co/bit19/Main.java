package kr.co.bit19;

import java.util.Scanner;

//예외 처리
class Num extends Exception{
    Num(){
        super("잘못된 값!!!");    //부모생성자 호출 Exception
    }
}
public class Main {

    static int in() throws Num{
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if(n<0){//음수면
            Num num=new Num();
            throw num;
        }
        return n;
    }
    public static void main(String[] args){

        System.out.println("양수 입력");

        try{    //예외발생할수 있는 코드
            int n=in();
            System.out.println(n);
        }catch (Exception  e){  //예외처리
            System.out.println(e.getMessage());
        }
    }
}
