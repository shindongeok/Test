package kr.co.bit62;
//@FunctionalInterface
//interface Function{
//    int cal(int x);
//}
interface A{
    void show();
}
public class Lambda03 {
    public static void main(String[] args) {
//        임의의 정수 제곱
//        Function f =x->
//                x*x;
//                System.out.println(f.cal(3));
        A a=()->{
            System.out.println("hi");
        };
        a.show();

        a=()-> System.out.println("안녕");
        a.show();
    }
}
