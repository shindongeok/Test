package kr.co.bit25;

class Po{
    int x;
    int y;

    Po(int x, int y){
        this.x=x;
        this.y=y;
    }

    //Objet클래스를 상속받고있다.
    @Override
    //문자열로 리턴
    public String toString(){
        return x + " " + y;
    }
}
//toString() 오바라이딩해 문자열 리턴가능
public class Main {
    public static void main(String[] args){
        Po p =new Po(3,4);
        System.out.println(p.hashCode());   //16진수
        System.out.println(p.getClass().getName()); //패키지명.클래스명
        System.out.println(p.toString());   //객체의 문자열
        System.out.println(p);  //객체가 문자열로 자동변환됨
    }
}
