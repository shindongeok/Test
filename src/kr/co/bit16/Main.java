package kr.co.bit16;

interface Re{

    default  void show(){
        System.out.println("사각형 출력!!");
    }
    abstract int area();


}

class Rec implements Re{
    int a;
    int b;

    Rec(int a, int b){
        this.a=a;
        this.b=b;
    }

    public int area(){
        return a*b;
    }
}
public class Main {
    public static void main(String[] args){
        //6. main()를 보고 인터페이스를 작성해라.
        // (인터페이스명은 Re,
        // 모든 메소드들을 인터페이스안에서 선언하고
        // show함수는 default로 설정,area는 abstract로 설정)

        Re r=new Rec(10,20);
        r.show(); //"사각형!!" 출력

        System.out.println("면적" + r.area());
    }
}
