package kr.co.bit26;

class Point{
    int a;
    int b;

    Point(int a, int b){
        this.a=a;
        this.b=b;
    }

    @Override
    public boolean equals(Object obj){ //objet obj = Point b
        Point p = (Point) obj;  //obj -> Point타입으로 다운 캐스팅
        // a가 어디를 가르키고, p.a가 어디를 가르키고 있는지,
        // b가 어디를 가르키고, p.b가 어디를 가르키고 있는지 알아야함.
        if(a == p.a && b==p.b){
            return true;
        }
        else  return false;
    }
}
public class Main {
    public static void main(String[] args){

        //객체 3개 생성
        Point a = new Point(1,2);
        Point b = new Point(1,2);
        Point c = new Point(2,3);

        //객체 번지 비교
        if(a == b){
            System.out.println("a == b");
        }
        //
        if(a.equals(b)){
            System.out.println("a와b는 같다");
        }
        if(a == c){
            System.out.println("a == c");
        }


    }

}
