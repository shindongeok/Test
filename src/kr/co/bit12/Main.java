package kr.co.bit12;

// 인터페이스 다중상속 개념
class  D implements C{
    @Override
    public  void funcA(){
        System.out.println("funcA");
    }
    @Override
    public  void funcB(){
        System.out.println("funcB");
    }
    @Override
    public  void funC(){
        System.out.println("funcC");
    }
}
public class Main {
    public static void main(String[] args){
        D d1 = new D();
        A a1 = d1;
        a1.funcA();

        B b1 = d1;
        b1.funcB();

        C c1=d1;
        c1.funcA();
        c1.funcB();
        c1.funC();
        
        // 인터페이스에서는 객체생성 불가
        // 상속받은 클래스 D에서 객체 생성해줌.
    }
}
