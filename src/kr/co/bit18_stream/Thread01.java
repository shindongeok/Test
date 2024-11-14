package kr.co.bit18_stream;


import java.util.ArrayList;

class Circle{

    private double x,y;
    private int r;


    Circle(double x, double y, int r){
        this.x=x; this.y=y; this.r=r;
    }

    void show(){
        System.out.println("x,y,r : "+x + " " +y + " " +r);
    }
}
public class Thread01 {
    public static void main(String[] args) {
        //3개의 Circle 객체 배열을 만들고 x, y, r값을 읽어
        // 3개의 Circle객체를 만들어 show()함수에서 다 출력해라.

//        Circle[] c = new Circle[3];
//        for(int i=0; i<c.length; i++){
//            c[i]= new Circle(1.0,2.0,3);
//
//        }

        Circle c1 = new Circle(2.0, 2.3, 1);
        Circle c2 = new Circle(2.3, 3.3, 1);
        Circle c3 = new Circle(2.1, 4.3, 1);
        c1.show();
        c2.show();
        c3.show();


        ArrayList<Integer> a = new ArrayList<>();



    }
}
