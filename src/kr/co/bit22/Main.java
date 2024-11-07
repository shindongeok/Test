package kr.co.bit22;


interface Figure{

    void circle_area();
    void rec_area();
}

class Circle implements Figure{
    int x;

    Circle(int x){
        this.x=x;
    }

    @Override
    public void circle_area(){
        System.out.println(x*x*3.14);
    }
    @Override
    public void rec_area(){}
}

class Rec implements Figure{
    int x,y;

    Rec(int x, int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public void rec_area(){
        System.out.println(x*y);
    }
    public void circle_area(){}

}



public class Main {
    public static void main(String[] args){
        //main()에 이렇게 주고, Figure인터페이스 만들어 circle_area()에는
        //원면적, rec+area()에는 사각형 면적 출력해라.

        Figure f1 = new Circle(5);
        Figure f2 = new Rec(2,5);

        f1.circle_area();
        f2.rec_area();
    }
}
