package kr.co.bit37;

class AA{
    @Override
    public String toString(){
        return "AA";
    }
}
class BB{
    @Override
    public String toString(){
        return "BB";
    }
}
class  In{
    <T> void show(T t){ //제네릭 메소드
        System.out.println(t);
    }
    void show(){
        System.out.println("generic");
    }
}


public class Main {
    public static void main(String[] args){

        AA a= new AA();
        BB b=new BB();
        In i=new In();

        i.<AA>show(a);  //AA클래스의 객체 AA t = a;
        i.<BB>show(b);
        i.show();
    }
}
