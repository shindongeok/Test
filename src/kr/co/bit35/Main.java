package kr.co.bit35;

import javax.swing.*;

//1. 다형성(형변환)
//generic 클래스 (클래스 타입이 정해져 있지 않은 파라미터 타입)
class Program<T>{   //모형자 < > : 제네릭
    T t;
    void in(T t){
        this.t=t;
    }
    T get(){
        return t;
    }
}

//구체화
class Java{
    String a;
    Java(String a){
        this.a=a;
    }

    void show(){
        System.out.println(a);
    }
}

class DB{
    String a;
    DB(String a){
        this.a=a;
    }

    void show(){
        System.out.println(a);
    }
}
public class Main {
    public static void main(String[] args){
        // < > 제네릭 기호.
        // 제네릭 클래스 객체 생성 코드.
        Program<Java> p = new Program<Java>();
        p.in(new Java("Java"));
        Java j = p.get();
        j.show();

        Program<DB> d = new Program<DB>();
        d.in(new DB("DB"));
        DB db = d.get();
        db.show();
    }
}
