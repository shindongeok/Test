package kr.co.bit43;

class Box<T>{   //<> 제네릭 클래스
    Box<T> next;
    T t;

    void in(T t){
        this.t=t;
    }
    T out(){
        return t;
    }
}


public class Main {
    public static void main(String[] args){
        Box<Integer> b= new Box<>();

        b.in(30); // Integer t = 30; 박싱.
        b.next = new Box<Integer>();
        b.next.in(40);  //객체에 한번 더 접근(체이닝)

        b.next.next = new Box<Integer>();
        b.next.next.in(50);

        Box<Integer> tmp;
        tmp =b.next;
        System.out.println(tmp.out());



    }
}
