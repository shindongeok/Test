package kr.co.bit02;

//추상클래스
//추상클래스안에는 일반적인 메소드, 추상 메소드 둘 다 가능.
//추상메소드는 반드시 추상클래스 안에 있어야한다.
abstract class Car{
    String name;    //필드

    void run(){     //메소드
        System.out.println("차가 움직인다.");
    }
    abstract void stop();   //추상메소드(빈껍데기 함수)
}
class Cars extends Car{
        Cars(){
            name="인피니티";
        }
        @Override
        void stop(){
            System.out.println("차가 멈춘다.");
        }
}



public class Main02 {
    public static void main(String[] args) {
        //추상클래스는 객체생성 불가능
//        Car c=new Car();
//      가능.
        Cars c=new Cars();
        c.run();
        c.stop();

    }
}
