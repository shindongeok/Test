package kr.co.bit14;

interface Animal{
    void bear();
}
interface Fish{
    void swin();
}

class A implements Animal , Fish{

    @Override
    // 재정의할때는 public 필수
    public void bear(){
        System.out.println("다중 상속");
    }
    @Override
    // 재정의할때는 public 필수
    public void swin(){
        System.out.println("다중상속");
    }

}

public class Main {
    public static void main(String[] args){

        A a = new A();
        a.bear();
        a.swin();
    }
}
