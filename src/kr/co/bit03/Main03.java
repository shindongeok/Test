package kr.co.bit03;

class Elec {
    String color;

    Elec(String c) {
        color = c;
    }
}
class Note extends Elec{
    int number;

    Note(String c, int n){
        super(c);
        number = n;
    }
}
//class Ipad extends Elec{
//    int a;
//    int b;
//
//    Ipad(String color, int a,int b){
//        super(color);
//        this.a=a;
//        this.b=b;
//    }
//    void show(){
//        System.out.println(color + "," + a + "," + b);
//    }
//
//}
class Ipad extends Note{
    int a;

    Ipad(String color, int number, int a){
        super(color, number);
        this.a=a;
    }

    void show(){
        System.out.println(color+ "," +number+","+a);
    }
}
public class Main03 {
    public static void main(String[] args) {
        Ipad i = new Ipad("빨간", 3, 18);
        i.show();
        //Ipad객체 만들어서 출력

    }
}
