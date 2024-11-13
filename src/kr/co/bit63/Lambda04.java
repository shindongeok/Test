package kr.co.bit63;
interface A{
    int cal(int x, int y);
}
public class Lambda04 {
    static void pr(int x, int y, A a){
        System.out.println(a.cal(4,2));
    }
    public static void main(String[] args) {
        pr(3,4,(x,y)->x+y);
    }
}
