package kr.co.bit13;
class  Tv{
    public void on(){
        System.out.println("티비 킴");
    }

}
class Com{
    public void m(){
        System.out.println("켬");
    }
}
class Ipad extends Tv implements Computer{
    Com c =new Com();

    @Override
    public void m(){
        c.m();
    }

    public void ip(){
        m();
        on();
    }

}

//interface A extends 부모인터페이스1, 부모인터페이스2
//class B implements 부모인터페이스1, 부모인터페이스2
//class C extends 부모클래스 implements  부모인터페이스
public class Main {
    public static void main(String[] args){
        Ipad i = new Ipad();
        Tv t = i;   //up
        Computer c=i;

        i.ip();
    }
}
