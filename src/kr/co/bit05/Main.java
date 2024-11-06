package kr.co.bit05;

// 업캐스팅
import java.util.Scanner;

abstract class Circle{
    protected double r;

    Circle(double r){
        this.r=r;
    }
    abstract double get();
}
class Cir extends Circle{
    Cir(double r){
        super(r);   //
    }
    @Override
    double get(){
        return r;
    }
}
public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        //객체배열
        Circle c[] = new Circle[5]; //Circle객체
//        Circle c[] = new Cir[5];

        for(int i=0; i<c.length; i++){
            double r=s.nextDouble();
            c[i] =new Cir(r);    //객체 생성
            System.out.println(c[i].get());
        }

    }
}
